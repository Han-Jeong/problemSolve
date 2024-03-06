package march.seventh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean myAnswer(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                return true;
            }
            hash.put(nums[i], i);
        }
        return false;
    }

    public boolean bestAnswer(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
