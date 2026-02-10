package dipayan.practise.prefixsum;

public class FindPivotIndex {
  public static void main(String[] args) {
    System.out.println(pivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
  }

  public static int pivotIndex(int[] nums) {
    int pivotIndex = -1;
    int[] prefixSums = new int[nums.length];
    int prefixSum = 0;
    int index = 0;

    for (int n : nums) {
      prefixSum += n;
      prefixSums[index++] = prefixSum;
    }

    for (int i = 0; i < prefixSums.length; i++) {
      int leftSum = prefixSums[i] - nums[i];
      int rightSum = prefixSum - leftSum - nums[i];

      if (leftSum == rightSum) {
        return i;
      }
    }

    return pivotIndex;
  }
}
