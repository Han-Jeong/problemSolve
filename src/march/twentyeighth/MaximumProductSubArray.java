package march.twentyeighth;

public class MaximumProductSubArray {
    public int myAnswer(int[] nums) {
        int currentProduct = nums[0] == 0 ? 1 : nums[0];
        int max = nums[0];
        int mark = nums[0] < 0 ? nums[0] : 0;

        for (int i = 1; i < nums.length; i++) {
            currentProduct *= nums[i];
            if (currentProduct < 0) {
                if (mark == 0) {
                    mark = currentProduct;
                }else{
                    int compareValue = currentProduct / mark;
                    max = Math.max(max, compareValue);
                }
            } else if (currentProduct > 0) {
                max = Math.max(max, currentProduct);
            }
            else{
                max = Math.max(max, currentProduct);
                currentProduct = 1;
                mark = 0;
            }
        }
        return max;
    }

    public int bestAnswer(int[] nums) {
        int max, min, res;
        max = min = 1;
        res = nums[0];

        for(int i = 1; i < nums.length; i++) {
            res = Math.max(res, nums[i]);
        }

        for(int i = 0; i < nums.length; i++) {
            int maxTemp = nums[i] * max;
            max = Math.max(Math.max(maxTemp, nums[i] * min), nums[i]);
            min = Math.min(Math.min(maxTemp, nums[i] * min), nums[i]);

            res = Math.max(res, max);
        }
        return res;
    }
}
