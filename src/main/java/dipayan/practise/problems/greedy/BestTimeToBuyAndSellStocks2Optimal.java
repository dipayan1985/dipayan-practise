package dipayan.practise.problems.greedy;

public class BestTimeToBuyAndSellStocks2Optimal {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{5, 4, 3, 2, 1}));
    }

    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; ) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                i++;
            } else {
                int profit = prices[i] - minPrice;
                totalProfit += profit;
                minPrice = Integer.MAX_VALUE;
            }
        }

        return totalProfit;
    }
}
