package dipayan.practise.problems.greedy;

public class BestTimeToBuyAndSellStockWithCooldown {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 2, 3, 0, 2}));
    }

    /*TODO: fix using DP*/
    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        boolean lastSold = false;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                if (lastSold) {
                    lastSold = false;
                    continue;
                }

                minPrice = prices[i];
            } else {
                if (lastSold) {
                    lastSold = false;
                    continue;
                }

                lastSold = true;
                int profit = prices[i] - minPrice;
                totalProfit += profit;
                minPrice = Integer.MAX_VALUE;
            }
        }

        return totalProfit;
    }
}
