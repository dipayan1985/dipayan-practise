package dipayan.practise.duplicates;

import java.util.HashMap;
import java.util.Map;

/** From prefixsumredo - alternate implementation. */
public class MaximumSizeSubarraySumEqualsK {
    // Core method
    public int maxSubArrayLen(int[] nums, int k) {
        int prefixSum = 0;
        Map<Integer, Integer> prefixSumToIndexMap = new HashMap<>();
        int maxLength = 0;

        prefixSumToIndexMap.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int diff = prefixSum - k;

            if (prefixSumToIndexMap.containsKey(diff)) {
                maxLength = Math.max(maxLength, i - prefixSumToIndexMap.get(diff));
            } else {
                /*TODO: out of else, always add prefix sum for next bigger arrays*/
                prefixSumToIndexMap.putIfAbsent(prefixSum, i);
            }

        }

        return maxLength;
    }

    // Quick test
    public static void main(String[] args) {
        MaximumSizeSubarraySumEqualsK solver = new MaximumSizeSubarraySumEqualsK();

        int[] nums1 = {1, -1, 5, -2, 3};
        System.out.println(solver.maxSubArrayLen(nums1, 3)); // Expected 4

        int[] nums2 = {1, 2, 3, -3, 3};
        System.out.println(solver.maxSubArrayLen(nums2, 3)); // Expected 3

        int[] nums3 = {1, 2, 3};
        System.out.println(solver.maxSubArrayLen(nums3, 7)); // Expected 0
    }
}
