package dipayan.practise.slidingwindowandtwopointers;

public class MinimumSizeSubarraySum {
  public static void main(String[] args) {
    System.out.println(minimumSizeSubArraySum(11, new int[] {1, 2, 3, 4, 5}));
  }

  private static int minimumSizeSubArraySum(int target, int[] nums) {
    int min = Integer.MAX_VALUE;
    int i = 0, j = 0;
    int sum = 0;

    while (i < nums.length) {
      sum += nums[i];

      while (sum >= target) {
        min = Math.min(min, i - j + 1);
        sum -= nums[j];
        j++;
      }

      i++;
    }

    return min;
  }
}
