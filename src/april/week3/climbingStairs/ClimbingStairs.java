package april.week3.climbingStairs;


import java.math.BigInteger;

public class ClimbingStairs {
    public static BigInteger climbStairs(int n) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i <= n; i += 2) {
            int blue = n - i;
            int red = i / 2;
            sum = combination(Math.max(blue, red), Math.min(blue, red)).add(sum);
        }
        System.out.println("sum = " + sum);
        return sum;
    }

    private static BigInteger combination(int big, int small) {
        BigInteger product = BigInteger.ONE;
        for (int i = 0; i < small; i++) {
            product = product.multiply(BigInteger.valueOf(Math.subtractExact(Math.addExact(big, small), i)));
        }
        product = product.divide(BigInteger.valueOf(factorial(small)));

        return product;
    }
    private static int factorial(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    public static int differentAnswer(int n) {
        int sum = 1;
        int save = 1;
        if (n >= 2) {
            for (int i = 2; i <= n; i++) {
                sum += save;
                save = sum - save;
            }
        }
        return sum;
    }

}
