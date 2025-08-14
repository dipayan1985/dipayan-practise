package dipayan.practise.problems.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AbsoluteDifference {
    public static void main(String[] args) {
        minimumAbsoluteDifference(new ArrayList<>(List.of(3, -7, 0)));
    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        int minAbsDiff = Integer.MAX_VALUE;

        /*for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int absDiff = Math.abs(arr.get(i) - arr.get(j));

                if (absDiff == 0) {
                    return 0;
                } else {
                    if (absDiff < minAbsDiff) {
                        minAbsDiff = absDiff;
                    }
                }
            }
        }*/

        arr.sort(Comparator.comparingInt(c -> c));
        int i = 0;

        while (i < arr.size() - 1) {
            int diff = Math.abs(arr.get(i) - arr.get(i + 1));

            i++;

            if (diff == 0) {
                return 0;
            }

            if (minAbsDiff > diff) {
                minAbsDiff = diff;
            }
        }

        return minAbsDiff;
    }
}
