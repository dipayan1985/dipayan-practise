package dipayan.practise.leetcodetop100;

public class SearchInsertPosition {
  public static void main(String[] args) {
    System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 2));
  }

  public static int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int pivot = left + (right - left) / 2;

      if (target == nums[pivot]) {
        return pivot;
      } else if (target > nums[pivot]) {
        left = pivot + 1;
      } else {
        right = pivot - 1;
      }
    }

    return left;
  }
}
