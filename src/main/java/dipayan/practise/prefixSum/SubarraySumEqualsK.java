package dipayan.practise.prefixSum;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {

    }

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        var prefixSumCountMap = new HashMap<Integer, Integer>();

        for (int num : nums) {
            prefixSum += num;
            int gap = prefixSum - k;

            count += prefixSumCountMap.getOrDefault(gap, 0);
            prefixSumCountMap.put(prefixSum, prefixSumCountMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
