package dipayan.practise.prefixsumredo;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println(subarraySum(nums, k)); // expected 2
    }

    public static int subarraySum(int[] nums, int k) {
        int prefixSum = 0, count = 0;
        Map<Integer, Integer> prefixSumToIndexMap = new HashMap<>();

        prefixSumToIndexMap.put(0, 1);

        for (int num : nums) {
            prefixSum += num;
            int diff = prefixSum - k;

            count += prefixSumToIndexMap.getOrDefault(diff, 0);
            prefixSumToIndexMap.put(prefixSum, prefixSumToIndexMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
