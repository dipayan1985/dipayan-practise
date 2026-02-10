package dipayan.practise.slidingwindowandtwopointers;

import java.util.*;

public class ContainsDuplicate3 {
  public static void main(String[] args) {
    System.out.println(containsNearbyAlmostDuplicate(new int[] {1, 2, 3, 1}, 3, 0));
  }

  public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
    int left = 0;
    int right = 0;
    TreeSet<Integer> numbers = new TreeSet<>();

    while (right < nums.length) {
      int number = nums[right];
      int targetUpper = number + valueDiff;
      int targetLower = number - valueDiff;

      // find smallest number >= number - valueDiff
      Integer candidate = numbers.ceiling(targetLower);

      if (candidate != null && candidate <= targetUpper) {
        return true;
      }

      numbers.add(number);

      if (right - left >= indexDiff) {
        numbers.remove(nums[left]);
        left++;
      }

      right++;
    }

    return false;
  }
}
