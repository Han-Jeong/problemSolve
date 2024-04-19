package april.week3.bestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int subResult = prices[i] - min;
            if (subResult < 0) {
                min = prices[i];
            }
            else{
                maxProfit = Math.max(subResult, maxProfit);
            }
        }
        return maxProfit;
    }
}
