package dipayan.practise.slidingwindowandtwopointers;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniuosSubsequence {
  public static void main(String[] args) {
    System.out.println(findLHS(new int[] {1, 3, 2, 2, 5, 2, 3, 7}));
  }

  public static int findLHS(int[] nums) {
    int maxLen = 0;
    int len = nums.length;
    int right = 0;
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    while (right < len) {
      int number = nums[right];
      frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);

      if (frequencyMap.containsKey(number + 1)) {
        maxLen =
            Math.max(frequencyMap.getOrDefault(number, 0) + frequencyMap.get(number + 1), maxLen);
      }

      if (frequencyMap.containsKey(number - 1)) {
        maxLen =
            Math.max(frequencyMap.getOrDefault(number, 0) + frequencyMap.get(number - 1), maxLen);
      }

      right++;
    }

    return maxLen;
  }
}
