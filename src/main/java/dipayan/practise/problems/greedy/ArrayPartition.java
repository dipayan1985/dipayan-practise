package dipayan.practise.problems.greedy;

import java.util.Arrays;

public class ArrayPartition {
  public static void main(String[] args) {
    System.out.println(arrayPairSum(new int[] {1, 4, 3, 2}));
  }

  public static int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int total = 0;
    int i = 0, j = 0;
    int numPairs = nums.length / 2;

    while (i < numPairs) {
      total += Math.min(nums[j], nums[j + 1]);
      j += 2;
      i += 1;
    }

    return total;
  }
}
