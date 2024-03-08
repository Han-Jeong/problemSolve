package march.eighth;

import java.util.Arrays;

public class ProductOfArrayExpectSelf {
    public int[] myAnswer(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];

        Arrays.fill(array, 1);
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                array[j - i] *= nums[j];
                array[j] *= nums[j - i];
            }
        }
        return array;
    }
}
