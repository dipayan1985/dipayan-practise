package dipayan.practise.prefixsumredo;

import java.util.HashMap;
import java.util.Map;

class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        int prefixSum = 0;
        Map<Integer, Integer> prefixSumRemainderMap = new HashMap<>();

        prefixSumRemainderMap.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int remainder = prefixSum % k;

            if (prefixSumRemainderMap.containsKey(remainder) && i - prefixSumRemainderMap.get(remainder) > 1) {
                return true;
            } else {
                prefixSumRemainderMap.putIfAbsent(remainder, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContinuousSubarraySum solver = new ContinuousSubarraySum();

        int[] nums1 = {23, 2, 4, 6, 7};
        //System.out.println(solver.checkSubarraySum(nums1, 6)); // expected true

        int[] nums2 = {23, 2, 6, 4, 7};
        //System.out.println(solver.checkSubarraySum(nums2, 6)); // expected true

        int[] nums3 = {23, 2, 6, 4, 7};
        //System.out.println(solver.checkSubarraySum(nums3, 13)); // expected false

        int[] nums4 = {6, 12};
        System.out.println(solver.checkSubarraySum(nums4, 6));
    }
}

