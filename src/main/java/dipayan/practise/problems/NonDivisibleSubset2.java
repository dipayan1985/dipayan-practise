package dipayan.practise.problems;

import java.util.List;

public class NonDivisibleSubset2 {
    public static void main(String[] args) {
        System.out.println(nonDivisibleSubset(6, List.of(19, 10, 12, 10, 24, 25, 22)));
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int maxSubset;
        int[] reminderFrequency = new int[k];

        for (int r : s) {
            reminderFrequency[r % k]++;
        }

        maxSubset = Math.min(reminderFrequency[0], 1);

        for (int i = 1; i <= k / 2; i++) {
            if (i == k - i) {
                maxSubset = maxSubset + Math.min(reminderFrequency[i], 1);
            } else {
                maxSubset = maxSubset + Math.max(reminderFrequency[i], reminderFrequency[k - i]);
            }
        }

        return maxSubset;
    }
}
