package dipayan.practise.slidingwindowandtwopointers;

import java.util.*;

public class FourSum {
  public static void main(String[] args) {}

  public List<List<Integer>> fourSum(int[] nums, int target) {
    Set<List<Integer>> combinations = new HashSet<>();
    Map<Integer, List<Pair>> indexToPairs = new HashMap<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        int sum = nums[i] + nums[j];

        indexToPairs.computeIfAbsent(sum, k -> new ArrayList<>()).add(new Pair(i, j));
      }
    }

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        int sum = nums[i] + nums[j];
        int diff = target - sum;

        if (indexToPairs.containsKey(diff)) {
          List<Pair> pairs = indexToPairs.get(diff);

          for (Pair pair : pairs) {
            combinations.add(List.of(nums[i], nums[j], nums[pair.left], nums[pair.right]));
          }
        }
      }
    }

    return new ArrayList<>(combinations);
  }

  private static class Pair {
    int left;
    int right;

    Pair(int left, int right) {
      this.left = left;
      this.right = right;
    }
  }
}
