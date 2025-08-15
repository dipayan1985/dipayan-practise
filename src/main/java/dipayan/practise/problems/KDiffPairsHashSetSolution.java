package dipayan.practise.problems;

import java.util.HashSet;
import java.util.Set;

public class KDiffPairsHashSetSolution {
    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{1, 1, 1, 2, 2}, 0));
    }

    public static int findPairs(int[] nums, int k) {
        int numPairs = 0;
        Set<Integer> seen = new HashSet<>();

        if (k == 0) {
            Set<Integer> duplicates = new HashSet<>();

            for (int num : nums) {
                if (!seen.add(num)) {
                    duplicates.add(num);
                }
            }

            return duplicates.size();
        }

        if (k > 0) {
            for (int j : nums) {
                seen.add(j);
            }

            for (int num : seen) {
                int expected = num + k;

                if (seen.contains(expected)) {
                    numPairs++;
                }
            }
        }

        return numPairs;
    }
}
