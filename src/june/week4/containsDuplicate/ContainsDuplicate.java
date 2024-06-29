package june.week4.containsDuplicate;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public boolean solution1(int[] nums, int k) {
        boolean result = false;
        for (int i = k; i > 0; i--) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == nums[j - i]) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public boolean solution2(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
