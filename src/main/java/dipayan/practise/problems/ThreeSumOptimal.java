package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumOptimal {
  public static void main(String[] args) {}

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> triplets = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];

        if (sum == 0) {
          triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
          left++;
          right--;
        } else if (sum > 0) {
          right--;
        } else {
          left++;
        }
      }
    }

    return triplets;
  }
}
