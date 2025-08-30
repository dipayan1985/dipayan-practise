package dipayan.practise.leetcodetop100;

public class BestTimeToBuyAndSellStocks2 {
    public static void main(String[] args) {
        //7,1,5,3,6,4
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    public static int maxProfit(int[] prices) {
        int totalProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }


        return totalProfit;
    }
}
