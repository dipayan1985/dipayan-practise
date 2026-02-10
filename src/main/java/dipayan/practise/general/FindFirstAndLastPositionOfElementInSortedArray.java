package dipayan.practise.general;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8)));
  }

  private static int[] searchRange(int[] nums, int num) {
    int[] positions = new int[] {-1, -1};

    positions[0] = binarySearch(nums, num, true);
    positions[1] = binarySearch(nums, num, false);

    return positions;
  }

  private static int binarySearch(int[] nums, int num, boolean leftFind) {
    int left = 0;
    int right = nums.length - 1;
    int found = -1;

    while (left <= right) {
      int pivot = left + (right - left) / 2;

      if (nums[pivot] == num) {
        if (leftFind) {
          right = pivot - 1;
        } else {
          left = pivot + 1;
        }

        found = pivot;
      } else if (nums[pivot] > num) {
        right = pivot - 1;
      } else {
        left = pivot + 1;
      }
    }

    return found;
  }
}
