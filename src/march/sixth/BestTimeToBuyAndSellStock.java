package march.sixth;

public class BestTimeToBuyAndSellStock {
    public int myAnswer(int[] prices) {
        int min = prices[0];
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            if (result < prices[i] - min) {
                result = prices[i] - min;
            }
        }
        return result;
    }

    public int bestAnswer(int[] prices) {
        return 0;
    }
}
