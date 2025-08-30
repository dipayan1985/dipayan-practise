package dipayan.practise.leetcodetop100;

import java.util.Map;

public class BestTimeToBuyAndSellStocksOptimal {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // 1,2,4
        System.out.println(maxProfit(prices)); // Expected output: 5
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
}
