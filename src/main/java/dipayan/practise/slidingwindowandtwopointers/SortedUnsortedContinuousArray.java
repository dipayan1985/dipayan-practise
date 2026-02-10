package dipayan.practise.slidingwindowandtwopointers;

import java.util.Arrays;

public class SortedUnsortedContinuousArray {
  public static void main(String[] args) {
    System.out.println(findUnsortedSubarray(new int[] {1, 2, 3, 4}));
  }

  public static int findUnsortedSubarray(int[] nums) {
    int[] copy = Arrays.copyOf(nums, nums.length);
    int i = 0;
    int j = copy.length - 1;
    boolean lowerMismatch = false;
    boolean upperMismatch = false;

    Arrays.sort(copy);

    while (i < j) {
      if (nums[i] == copy[i] && !lowerMismatch) {
        i++;
      } else {
        lowerMismatch = true;
      }

      if (nums[j] == copy[j] && !upperMismatch) {
        j--;
      } else {
        upperMismatch = true;
      }

      if (lowerMismatch && upperMismatch) {
        return j - i + 1;
      }
    }

    return 0;
  }
}
