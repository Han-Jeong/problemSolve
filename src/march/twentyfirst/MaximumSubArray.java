package march.twentyfirst;

public class MaximumSubArray {
    public int myAnswer(int[] nums) {
        int init = nums[0];
        int max = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (init < 0) {
                if (init < nums[i]) {
                    init = nums[i];
                    sum = nums[i];
                }
            }else{
                int prevSum = sum;
                sum += nums[i];
                if (sum > prevSum) {
                    if (nums[i] > sum) {
                        init = nums[i];
                        sum = init;
                    }
                }
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

    public int bestAnswer(int[] nums) {
        int currentSum = nums[0];
        int maxSum = currentSum;


        for (int i = 1; i < nums.length;  i++){
            if(currentSum < 0){
                currentSum = nums[i];
            }else{
                currentSum += nums[i];
            }
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
