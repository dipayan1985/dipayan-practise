package dipayan.practise.slidingwindowandtwopointers;

public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {

    }

    public int longestOnes(int[] nums, int k) {
        int longest = 0;
        int right = 0;
        int left = 0;
        int zeroCount = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }

                left++;
            }

            longest = Math.max(longest, right - left + 1);
            right++;
        }

        return longest;
    }
}
