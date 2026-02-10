package dipayan.practise.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class BinarySubarrayWithSumOptimal {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // sum 0 occurs once before starting

        int prefixSum = 0;
        int result = 0;

        for (int num : nums) {
            prefixSum += num; // running prefix sum

            // Check if there is a previous prefix that would make subarray sum = goal
            result += prefixCount.getOrDefault(prefixSum - goal, 0);

            // Record this prefix sum
            prefixCount.put(prefixSum, prefixCount.getOrDefault(prefixSum, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        System.out.println(numSubarraysWithSum(nums, goal)); // Output: 4
    }
}
