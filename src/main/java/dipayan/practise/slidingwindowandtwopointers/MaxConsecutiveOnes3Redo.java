package dipayan.practise.slidingwindowandtwopointers;

public class MaxConsecutiveOnes3Redo {
  public int longestOnes(int[] nums, int k) {
    int len = nums.length;
    int maxLen = 0;
    int zeros = 0;
    int i = 0;
    int j = 0;

    while (i < len) {
      if (nums[i] == 0) {
        zeros++;
      }

      while (zeros > k) {
        if (nums[j] == 0) {
          zeros--;
        }

        j++;
      }

      maxLen = Math.max(maxLen, i - j + 1);
      i++;
    }

    return maxLen; // placeholder
  }

  public static void main(String[] args) {
    MaxConsecutiveOnes3Redo solver = new MaxConsecutiveOnes3Redo();

    // Test case 1
    int[] nums1 = {1, 0, 0, 1, 1, 0, 1};
    int k1 = 2;

    // Test case 2
    int[] nums2 = {0, 0, 1, 1, 0, 1, 1, 1};
    int k2 = 1;

    System.out.println("Test case 1 result: " + solver.longestOnes(nums1, k1)); // 6
    System.out.println("Test case 2 result: " + solver.longestOnes(nums2, k2)); // 5
  }
}
