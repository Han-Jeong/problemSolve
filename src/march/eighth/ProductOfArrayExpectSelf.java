package march.eighth;

import java.util.Arrays;

public class ProductOfArrayExpectSelf {
    public int[] myAnswer(int[] nums) {
        int n = nums.length;
        int product1 = 1;
        int product2 = 1;
        int[] array = new int[n];
        array[0] = 1;

//        Arrays.fill(array, 1);
        for (int i = 1; i < n; i++) {
            product1 *= nums[i - 1];
            array[i] = product1;
        }
        for (int i = 1; i < n; i++) {
            product2 *= nums[n - i];
            array[n - i - 1] *= product2;
        }
        return array;
    }
}
