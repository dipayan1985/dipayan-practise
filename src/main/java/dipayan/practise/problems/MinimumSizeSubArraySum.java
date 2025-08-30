package dipayan.practise.problems;

public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        System.out.println(minimumSizeSubArraySum(11, new int[]{1, 2, 3, 4, 5}));
    }

    public static int minimumSizeSubArraySum(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum = sum + nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum = sum - nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
