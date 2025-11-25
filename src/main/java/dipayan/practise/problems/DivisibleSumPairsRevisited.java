package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DivisibleSumPairsRevisited {
    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 3, List.of(1, 3, 2, 6, 1, 2)));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int totalPairs = 0;
        Map<Integer, List<Integer>> reminderToNumbers = new HashMap<>();

        for (int num : ar) {
            int reminder = num % k;
            int complement = (k - reminder) % k;

            List<Integer> matchedComplements = reminderToNumbers.get(complement);

            if (matchedComplements != null) {
                totalPairs += matchedComplements.size();
            }

            reminderToNumbers.computeIfAbsent(reminder, l -> new ArrayList<>()).add(num);
        }

        return totalPairs;
    }
}
