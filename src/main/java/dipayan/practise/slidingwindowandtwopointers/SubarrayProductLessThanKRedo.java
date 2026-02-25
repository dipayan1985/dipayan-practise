package dipayan.practise.slidingwindowandtwopointers;

public class SubarrayProductLessThanKRedo {
  public int numSubarrayProductLessThanK(int[] nums, int k) {
    int numArrays = 0;
    int right = 0;
    int left = 0;
    int len = nums.length;
    int product = 1;

    while (right < len) {
      product *= nums[right];

      while (product >= k && left <= right) {
        product /= nums[left];
        left++;
      }

      numArrays += right - left + 1;
      right++;
    }

    return numArrays; // placeholder
  }

  public static void main(String[] args) {
    SubarrayProductLessThanKRedo solver = new SubarrayProductLessThanKRedo();

    // Test case 1
    int[] nums1 = {10, 5, 2, 6};
    int k1 = 100;
    System.out.println(
        "Test case 1 result: "
            + solver.numSubarrayProductLessThanK(nums1, k1)); // Expected output: 8

    // Test case 2
    int[] nums2 = {1, 2, 3};
    int k2 = 0;
    System.out.println(
        "Test case 2 result: "
            + solver.numSubarrayProductLessThanK(nums2, k2)); // Expected output: 0
  }
}
