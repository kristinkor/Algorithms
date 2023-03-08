public class MaxProfit {
    public int maxProfit(int[] prices) {

        int lowerPrice = prices[0];
        int profit = 0;


        for (int i = 1; i < prices.length; i++) {
            int cost = prices[i] - lowerPrice;
            System.out.println(profit);
            if (profit < cost) {
                profit = cost;
                System.out.println(profit);
            }

            if (lowerPrice > prices[i]) {
                lowerPrice = prices[i];
                System.out.println(lowerPrice);
            }

        }
        return profit;
    }
}
