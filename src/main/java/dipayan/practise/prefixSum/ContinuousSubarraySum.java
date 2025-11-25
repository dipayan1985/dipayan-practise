package dipayan.practise.prefixSum;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    public static void main(String[] args) {
        System.out.println(checkSubarraySum(new int[]{23, 2, 4, 6, 6}, 7));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        int prefixSum = 0;
        Map<Integer, Integer> remainderToIndex = new HashMap<>();
        remainderToIndex.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int reminder = prefixSum % k;

            if (remainderToIndex.containsKey(reminder)) {
                int indexDiff = i - remainderToIndex.get(reminder);

                if (indexDiff > 1) {
                    return true;
                }
            } else {
                remainderToIndex.put(reminder, i);
            }
        }

        return false;
    }
}
