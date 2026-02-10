package dipayan.practise.slidingwindowandtwopointers;

public class LongestContinuousSubarray {
    public static void main(String[] args) {
        int[] nums = {8, 2, 4, 7};
        int k = 4;

        LongestContinuousSubarray solver = new LongestContinuousSubarray();

        int result = solver.longestSubarray(nums, k);
        System.out.println("Result: " + result);
    }

    // You will implement this (brute force first)
    public int longestSubarray(int[] nums, int k) {
        int length = 0;
        int left = 0;
        int min = nums[0]; // 8
        int max = nums[0]; // 8

        for (int right = 0; right < nums.length; right++) {
            min = Math.min(min, nums[right]); // min = 2
            max = Math.max(max, nums[right]); // max = 8
            int diff = Math.abs(max - min);

            while (diff > k) {
                int l = left + 1;
                int newMin = Integer.MAX_VALUE;

                while (l <= right) {
                    newMin = Math.min(newMin, nums[l]);
                    l++;
                }

                min = newMin;

                int r = left + 1;
                int newMax = Integer.MIN_VALUE;

                while (r <= right) {
                    newMax = Math.max(newMax, nums[r]);
                    r++;
                }

                max = newMax;

                diff = Math.abs(newMax - newMin);
                left++;
            }

            length = Math.max(length, right - left + 1);
        }

        return length;
    }
}

