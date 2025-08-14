package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberSumAfterQueries {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[][] queries = {
                {1, 0},
                {-3, 1},
                {-4, 0},
                {2, 3}
        };

        EvenNumberSumAfterQueries obj = new EvenNumberSumAfterQueries();
        int[] result = obj.sumEvenAfterQueries(nums, queries);

        // Print result
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }


    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int evenSum = 0;
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenSum = evenSum + nums[i];
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int value = queries[i][0];
            int index = queries[i][1];
            int newValue = nums[index] + value;

            if (nums[index] % 2 != 0) {
                if (newValue % 2 == 0) {
                    evenSum = evenSum + newValue;
                }
            } else {
                if (newValue % 2 == 0) {
                    evenSum = evenSum - nums[index];
                    evenSum = evenSum + newValue;
                } else {
                    evenSum = evenSum - nums[index];
                }
            }

            nums[index] = newValue;
            results.add(evenSum);
        }

        return results.stream().mapToInt(c -> c).toArray();
    }
}
