package dipayan.practise.problems;

import java.util.List;

public class DivisibleSumPairs2 {
    public static void main(String[] args) {
        System.out.println(divisibleSumPairs2(6, 5, List.of(1, 2, 3, 4, 5, 6)));
    }

    public static int divisibleSumPairs2(int n, int k, List<Integer> ar) {
        int numPairs = 0;
        int[] remainderCount = new int[k];

        for (int val : ar) {
            int remainder = val % k; // 1
            int complement = (k - remainder) % k; // 4
            System.out.println(remainderCount[complement]);
            numPairs += remainderCount[complement];
            remainderCount[remainder]++; // 1,2,1,1,1
        }

        return numPairs;
    }
}
