package dipayan.practise.slidingwindowandtwopointers;

import java.util.Arrays;

public class NumSubsequence {
  public static void main(String[] args) {
    System.out.println(numSubseq(new int[] {2, 3, 3, 4, 6, 7}, 12));
  }

  public static int numSubseq(int[] nums, int target) {
    int count = 0;
    int right = nums.length - 1;
    Arrays.sort(nums);

    for (int left = 0; left <= right; ) {
      int sum = nums[left] + nums[right];

      if (sum <= target) {
        count += (int) Math.pow(2, right - left);
        left++;
      } else {
        right--;
      }
    }

    return count;
  }
}
