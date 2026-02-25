package dipayan.practise.slidingwindowandtwopointers;

public class MaximumAverageSubarray1 {
  public static void main(String[] args) {
    System.out.println(findMaxAverage(new int[] {1, 12, -5, -6, 50, 3}, 4));
  }

  public static double findMaxAverage(int[] nums, int k) {
    double max = Double.NEGATIVE_INFINITY;
    double sum = 0.0;
    int right = k;
    int left = 0;

    for (int i = 0; i < k; i++) {
      sum += nums[i];
    }

    max = Math.max(max, sum / k);

    while (right < nums.length) {
      sum = sum - nums[left] + nums[right];
      max = Math.max(max, sum / k);
      right++;
      left++;
    }

    return max;
  }
}
