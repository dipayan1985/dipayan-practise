package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        int diff = diagonalDifference(new ArrayList<>(Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, -7, 6),
                Arrays.asList(7, 8, 12)
        )));

        System.out.println("diff is " + diff);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0, j = arr.size() - 1; i <= arr.size() && j >= 0; i++, j--) {
            sum1 = sum1 + arr.get(i).get(j);
            sum2 = sum2 + arr.get(i).get(i);
        }

        System.out.println("Sum1 = " + sum1);
        System.out.println("Sum2 = " + sum2);

        return sum1 > sum2 ? sum1 - sum2 : sum2 - sum1;
    }
}
