package dipayan.practise.slidingwindowandtwopointers;

public class SubarrayProductLessThanK {
  public static void main(String[] args) {
    System.out.println(numSubarrayProductLessThanK(new int[] {10, 5, 2, 6}, 100));
  }

  public static int numSubarrayProductLessThanK(int[] nums, int k) {
    int numSubArrays = 0;
    int runningProduct = 1;

    int i = 0;
    int j = 0;

    while (i < nums.length) {
      runningProduct *= nums[i];

      while (runningProduct >= k && j <= i) {
        runningProduct = runningProduct / nums[j];
        j++;
      }

      numSubArrays += i - j + 1;

      i++;
    }

    return numSubArrays;
  }
}
