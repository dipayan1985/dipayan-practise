package dipayan.practise.slidingwindowandtwopointers;

public class MoveZeroes {
  public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};

    moveZeroes(nums);

    for (int n : nums) {
      System.out.print(n + " ");
    }
  }

  public static void moveZeroes(int[] nums) {
    int len = nums.length;
    int index = 0;

    for (int i = 0; i < len; i++) {
      if (nums[i] != 0) {
        nums[index++] = nums[i];
      }
    }

    while (index <= len - 1) {
      nums[index++] = 0;
    }
  }
}
