package dipayan.practise.problems.greedy;

import java.util.*;
import java.util.stream.Collectors;

public class GreedyFlorist {
    public static void main(String[] args) {
        int k = 3; // number of friends
        int[] c = {1, 3, 5, 7, 9}; // flower costs

        int totalCost = getMinimumCost(k, c);

        System.out.println("Minimum cost: " + totalCost);
    }

    static int getMinimumCost(int k, int[] c) {
        int numberOfFlowers = c.length;
        int minCost = 0;
        List<Integer> flowerCosts = Arrays.stream(c).boxed().collect(Collectors.toList());

        flowerCosts.sort(Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
            minCost = minCost + flowerCosts.get(i);
        }

        for (int i = k; i < numberOfFlowers; i++) {
            int multiplier = 1 + (i / k);

            minCost = minCost + (multiplier * flowerCosts.get(i));
        }

        return minCost;
    }
}
