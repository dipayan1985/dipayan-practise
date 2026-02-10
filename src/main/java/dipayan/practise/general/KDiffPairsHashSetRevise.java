package dipayan.practise.general;

import java.util.*;
import java.util.stream.Collectors;

public class KDiffPairsHashSetRevise {
    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{3, 1, 4, 1, 5}, 2)); // Expected: 2
        /*System.out.println(findPairs(new int[]{1, 2, 3, 4, 5}, 1)); // Expected: 4
        System.out.println(findPairs(new int[]{1, 3, 1, 5, 4}, 0)); // Expected: 1
        System.out.println(findPairs(new int[]{1, 1, 1, 2, 2}, 0)); // Expected: 2
        System.out.println(findPairs(new int[]{1, 2, 3, 4, 5}, 10)); // Expected: 0*/
    }

    public static int findPairs(int[] nums, int k) {
        int numPairs = 0;

        if (k > 0) {
            Set<Integer> pairsSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());

            for (int n : pairsSet) {
                if (pairsSet.contains(n + k)) {
                    numPairs++;
                }
            }
        } else {
            Map<Integer, Integer> numToFreqMap = new HashMap<>();

            for (int n : nums) {
                numToFreqMap.put(n, numToFreqMap.getOrDefault(n, 0) + 1);
            }

            numPairs = numToFreqMap.values().stream().filter(val -> val > 1).toList().size();
        }

        return numPairs;
    }
}
