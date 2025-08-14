package dipayan.practise.sorting;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        miniMaxSum(new ArrayList<>(List.of(256741038, 623958417, 467905213, 714532089, 938071625)));
    }

    public static void miniMaxSum(List<Integer> arr) {
        arr.sort(Integer::compare);
        long min = 0;
        long max = 0;

        for (int i = 0, j = arr.size() - 1; i < arr.size() - 1 && j > 0; i++, j--) {
            min = min + arr.get(i);
            max = max + arr.get(j);
        }

        System.out.println(min + " " + max);
    }
}
