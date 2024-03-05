package march.fifth;

import java.util.HashMap;


public class TwoSum {
    public int[] myAnswer(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int index = 0; index < nums.length; index++) {
            hashMap.put(nums[index], index);
        }
        for (int index = 0; index < nums.length; index++) {
            if (hashMap.containsKey(target - nums[index])) {
                int getValue = hashMap.get(target - nums[index]);
                if (getValue != index) {
                    return new int[]{index, getValue};
                }
            }
        }
        return null;
    }

    public int[] bestAnswer(int[] nums, int target) {
        int a[]=new int[2];

        int n = nums.length;
        for(int i = 1; i < n; i++){
            for(int j = i; j < n; j++){
                if(nums[j] + nums[j-i] == target){
                    return new int[] {j-i,j};
                }
            }
        }
        return null;
    }
}
