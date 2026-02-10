package dipayan.practise.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{0, 1, 1, 1, 1, 1, 0, 0, 0}));
    }

    public static int findMaxLength(int[] nums) {
        int prefixSum = 0;
        int maxLen = 0;
        Map<Integer, Integer> prefixSumToIndex = new HashMap<>();

        prefixSumToIndex.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefixSum += (nums[i] == 0) ? -1 : 1;

            if (prefixSumToIndex.containsKey(prefixSum)) {
                maxLen = Math.max(maxLen, i - prefixSumToIndex.get(prefixSum));
            }

            prefixSumToIndex.put(prefixSum, i);
        }

        return maxLen;
    }
}
