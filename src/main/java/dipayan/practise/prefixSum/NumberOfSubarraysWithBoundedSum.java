package dipayan.practise.prefixSum;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubarraysWithBoundedSum {
    public int countRangeSum(int[] nums, int lower, int upper) {
        int count = 0;
        int prefixSum = 0;
        Map<Integer, Integer> prefixSumToCountMap = new HashMap<>();

        for (int num : nums) {
            prefixSum += num;

            long diffLower = prefixSum - upper; // S[j] - upper
            long diffUpper = prefixSum - lower; // S[j] - lower

            for (long key : prefixSumToCountMap.keySet()) {
                if (key >= diffLower && key <= diffUpper) {
                    count += prefixSumToCountMap.get(key);
                }
            }

            prefixSumToCountMap.put(prefixSum, prefixSumToCountMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
