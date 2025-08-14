package dipayan.practise.arrays;

import java.util.List;

public class NonDivisibleSubset2 {
    public static void main(String[] args) {
        System.out.println(nonDivisibleSubset(3, List.of(1, 7, 2, 4)));
    }

    private static int nonDivisibleSubset(int divisor, List<Integer> integers) {
        int[] reminders = new int[divisor];
        int subsetSize = 0;

        for (int i = 0; i < integers.size(); i++) {
            reminders[integers.get(i) % divisor]++;
        }

        subsetSize = subsetSize + Math.min(reminders[0], 1);

        for (int i = 1; i <= divisor / 2; i++) {
            subsetSize = subsetSize + Math.max(reminders[i], reminders[divisor - i]);
        }

        return subsetSize;
    }
}
