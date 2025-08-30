package dipayan.practise.leetcodetop100;

import java.util.*;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // 1,2,4
        System.out.println(maxProfit(prices)); // Expected output: 5
    }

    public static int maxProfit(int[] prices) {
        int length = prices.length;
        Map<Integer, List<Integer>> indexToPrice = new HashMap<>();

        for (int i = 0; i < length; i++) {
            indexToPrice.computeIfAbsent(prices[i], k -> new ArrayList<>()).add(i);
        }

        Arrays.sort(prices);

        int maxProfit = 0;

        for (int iter = 0; iter < prices.length - 1; iter++) {
            int j = length - 1;

            while (iter < j) {
                int currentMin = prices[iter];
                int currentMax = prices[j];
                List<Integer> currentMinIndexes = indexToPrice.get(currentMin);
                List<Integer> currentMaxIndexes = indexToPrice.get(currentMax);
                boolean matched = false;

                for (int minIndex : currentMinIndexes) {
                    for (int maxIndex : currentMaxIndexes) {
                        if (minIndex < maxIndex) {
                            maxProfit = Math.max(maxProfit, currentMax - currentMin);
                            matched = true;
                            break;
                        }
                    }

                    if (matched) {
                        break;
                    }
                }

                if (!matched) {
                    j--;
                } else {
                    break;
                }
            }
        }

        return maxProfit;
    }
}
