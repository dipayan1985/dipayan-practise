package dipayan.practise.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {
  public static void main(String[] args) {}

  public List<List<Integer>> threeSum(int[] nums) {
    Map<Integer, List<Integer>> valueToIndex = new HashMap<>();
    List<List<Integer>> triplets = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      valueToIndex.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
    }

    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        int sum = nums[i] + nums[j];
        int diff = -sum;

        if (valueToIndex.containsKey(diff)) {
          List<Integer> indexOfDiff = valueToIndex.get(diff);

          for (Integer k : indexOfDiff) {
            List<Integer> triplet = new ArrayList<>();

            if (k > j) {
              triplet.add(diff);
              triplet.add(nums[i]);
              triplet.add(nums[j]);

              triplets.add(triplet);
            }
          }
        }
      }
    }

    return triplets;
  }
}
