package dipayan.practise.slidingwindowandtwopointers;

import java.util.*;
import java.util.stream.Stream;

public class ThreeSum {
  public static void main(String[] args) {}

  public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> triplets = new HashSet<>();
    Map<Integer, Integer> valueToIndex = new HashMap<>();

    for (int left = 0; left < nums.length; left++) {
      valueToIndex.clear();
      int sum = nums[left];

      for (int leftPlusOne = left + 1; leftPlusOne < nums.length; leftPlusOne++) {
        int diff = -sum - nums[leftPlusOne];

        if (valueToIndex.containsKey(diff)) {
          triplets.add(Stream.of(nums[left], nums[leftPlusOne], diff).sorted().toList());
        } else {
          valueToIndex.put(nums[leftPlusOne], leftPlusOne);
        }
      }

      valueToIndex.put(nums[left], left);
    }

    return triplets.stream().toList();
  }
}
