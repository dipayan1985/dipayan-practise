package dipayan.practise.sorting;

import java.util.ArrayList;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println(maxMin(2, new ArrayList<>(List.of(1, 4, 7, 2))));
    }

    public static int maxMin(int k, List<Integer> arr) {
        int fairness = Integer.MAX_VALUE;

        int i = 0;
        int size = arr.size();

        arr.sort(Integer::compare);

        while (i + k < size) {
            int subMax = Math.max(arr.get(i), arr.get(i + k - 1));
            int subMin = Math.min(arr.get(i), arr.get(i + k - 1));

            int fair = subMax - subMin;

            if (fair < fairness) {
                fairness = fair;
            }

            i = i + 1;
        }

        return fairness;
    }
}
