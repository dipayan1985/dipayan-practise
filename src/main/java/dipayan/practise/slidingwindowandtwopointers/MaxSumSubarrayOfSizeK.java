package dipayan.practise.slidingwindowandtwopointers;

public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {
        System.out.println(maxSumSubarray(new int[]{2, 1, 5, 1, 3, 2}, 3)); // 9
        System.out.println(maxSumSubarray(new int[]{2, 3, 4, 1, 5}, 2));    // 7
    }

    public static int maxSumSubarray(int[] nums, int k) {
        int maxSum = 0;
        int i = 0;
        int j = i + k;

        while (j < nums.length) {
            int sum = 0;
            int l = i;

            while (l < j) {
                sum = sum + nums[l];
                l++;
            }

            maxSum = Math.max(sum, maxSum);
            i++;
            j++;
        }

        return maxSum;
    }
}
