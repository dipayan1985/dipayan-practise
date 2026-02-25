package dipayan.practise.leetcodetop150;

import java.util.Arrays;

public class MajorityElement {
  public static void main(String[] args) {
    System.out.println(majorityElement(new int[] {2, 2, 1, 4}));
    System.out.println(majorityElementBoyerMoore(new int[] {2, 2, 1, 4}));
  }

  public static int majorityElement(int[] nums) {
    Arrays.sort(nums);
    int len = nums.length;
    int half = len / 2;
    int count = 1;

    if (len == 1 && half <= 1) {
      return nums[0];
    }

    /*
    Condition checks and count evaluation in if..else
    compute result after
     */

    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] == nums[i]) {
        count++;
      } else {
        count = 1;
      }

      if (count > half) {
        return nums[i];
      }
    }

    return 0;
  }

  public static int majorityElementBoyerMoore(int[] nums) {
    /* the last candidate survives and that is majority element */
    int count = 0;
    int candidate = 0;

    for (int n : nums) {
      if (count == 0) {
        candidate = n;
      }

      count += n == candidate ? 1 : -1;
    }

    return candidate;
  }
}
