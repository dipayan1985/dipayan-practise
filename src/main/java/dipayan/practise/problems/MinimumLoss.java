package dipayan.practise.problems;

import java.util.*;

public class MinimumLoss {
    public static void main(String[] args) {
        System.out.println(minimumLoss(new ArrayList<>(List.of(20l, 7l, 8l, 2l, 5l))));
    }

    public static int minimumLoss(List<Long> price) {
        long minLoss = Integer.MAX_VALUE;
        Map<Long, Integer> priceToYearMap = new HashMap<>();

        for (int i = 0; i < price.size(); i++) {
            priceToYearMap.put(price.get(i), i);
        }

        price.sort(Comparator.reverseOrder());

        for (int i = 0; i < price.size() - 1; i++) {
            Long currentPrice = price.get(i);
            Long nextPrice = price.get(i + 1);

            if (currentPrice - nextPrice < minLoss
                    && (priceToYearMap.get(currentPrice) < priceToYearMap.get(nextPrice))) {
                minLoss = currentPrice - nextPrice;
            }
        }

        return Math.toIntExact(minLoss);
    }
}
