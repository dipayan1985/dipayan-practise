package dipayan.practise.leetcodetop100;

public class SearchInRotatedSortedArray {
  public static void main(String[] args) {
    System.out.println(search(new int[] {6, 7, 0, 1, 2, 3, 4}, 0));
  }

  public static int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (target == nums[mid]) {
        return mid;
      }

      if (nums[left] <= nums[mid]) {
        if (target < nums[mid] && target >= nums[left]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if (target > nums[mid] && target <= nums[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }

    return -1;
  }
}
