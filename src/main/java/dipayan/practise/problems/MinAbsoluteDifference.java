package dipayan.practise.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = {3, 8, 15, 17};
        int result = minimumAbsoluteDifference(arr);
        System.out.println(result);
    }

    private static int minimumAbsoluteDifference(int[] arr) {
        int minDiff = Integer.MAX_VALUE;
        List<Integer> sorted = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());

        for (int i = 0; i < sorted.size() - 1; i++) {
            int diff = Math.abs(sorted.get(i) - sorted.get(i + 1));

            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}
