package july.week1.happyNumber;

import java.util.HashSet;

public class HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1) {
            int sum = 0;
            String numToStr = String.valueOf(n);
            for (int i = 0; i < numToStr.length(); i++) {
                int eachNum = numToStr.charAt(i) - '0';
                sum += (int) Math.pow(eachNum, 2);
            }
            if (set.contains(sum)) {
                return false;
            }
            n = sum;
            set.add(n);
        }
        return true;
    }
}
