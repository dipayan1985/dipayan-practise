package dipayan.practise.prefixsumredo;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
  public int findMaxLength(int[] nums) {
    // Initialize a prefix sum and hashmap
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1); // base case

    int maxLen = 0;
    int prefixSum = 0;

    for (int i = 0; i < nums.length; i++) {
      prefixSum += (nums[i] == 0) ? -1 : 1;
      System.out.println(prefixSum + " " + i);

      if (map.containsKey(prefixSum)) {
        maxLen = Math.max(maxLen, i - map.get(prefixSum));
      } else {
        map.put(prefixSum, i);
      }
    }

    return maxLen;
  }

  public static void main(String[] args) {
    ContiguousArray ca = new ContiguousArray();
    int[] nums = {0, 1, 0, 1, 1, 0};
    System.out.println(ca.findMaxLength(nums));
  }
}
