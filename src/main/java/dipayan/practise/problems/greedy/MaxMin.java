package dipayan.practise.problems.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println(maxMin(2, new ArrayList<>(List.of(1, 4, 7, 2))));
    }

    public static int maxMin(int k, List<Integer> arr) {
        arr.sort(Comparator.comparingInt(i -> i));
        int diff = Integer.MAX_VALUE;

        int i = 0;

        while (i + k < arr.size()) {
            int max = arr.subList(i, i + k).stream().max(Comparator.comparingInt(o -> o)).get();
            int min = arr.subList(i, i + k).stream().min(Comparator.comparingInt(o -> o)).get();
            int currDiff = Math.abs(max - min);

            if (currDiff < diff) {
                diff = currDiff;
            }

            i += 1;
        }

        return diff;
    }
}
