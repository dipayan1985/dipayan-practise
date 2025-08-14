package dipayan.practise.problems;

import java.util.List;

public class MigratoryBirds {
    public static void main(String[] args) {
        System.out.println(migratoryBirds(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }

    public static int migratoryBirds(List<Integer> arr) {
        int[] frequency = new int[arr.size()];

        for (int a : arr) {
            frequency[a]++;
        }

        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxValue) {
                maxValue = frequency[i];
            }
        }

        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == maxValue) {
                if (i < minIndex) {
                    minIndex = i;
                }
            }
        }

        return minIndex;
    }
}
