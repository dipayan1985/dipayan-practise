package dipayan.practise.slidingwindowandtwopointers;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
  public static void main(String[] args) {
    int[] nums = {4, 2, 12, 3, 8};
    int k = 3;

    System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
  }

  public static int[] maxSlidingWindow(int[] nums, int k) {
    int n = nums.length;
    int[] results = new int[n - k + 1];
    Deque<Integer> dq = new ArrayDeque<>();
    int index = 0;

    for (int i = 0; i <= n - k; i++) {
      dq.clear();
      int j = i + k;
      int l = i;

      while (l < j) {
        int element = nums[l];

        while (!dq.isEmpty() && nums[dq.peekLast()] < element) {
          dq.pollLast();
        }

        dq.offerLast(l);
        l++;
      }

      results[index++] = nums[dq.peekFirst()];
    }

    return results;
  }
}
