package dipayan.practise.leetcodetop150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
  public static void main(String[] args) {}

  public static int[][] merge(int[][] intervals) {
    List<int[]> merged = new ArrayList<>();

    if (intervals.length == 0) {
      return new int[0][0];
    }

    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    int[] current = intervals[0];

    for (int i = 1; i < intervals.length; i++) {
      int[] next = intervals[i];

      if (next[0] <= current[1]) {
        /*If the next interval start is less than the current interval end, then merge*/
        current[1] = Math.max(next[1], current[1]);
      } else {
        merged.add(current);
        current = next;
      }
    }

    merged.add(current);

    return merged.toArray(new int[merged.size()][]);
  }

  public static int[][] merge2(int[][] intervals) {
    List<int[]> merged = new ArrayList<>();
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    int[] interval = intervals[0];
    int firstIntervalStart = interval[0];
    int firstIntervalEnd = interval[1];

    for (int i = 1; i < intervals.length; i++) {
      int[] next = intervals[i];
      int nextIntervalFirst = next[0];
      int nextIntervalEnd = next[1];

      if (firstIntervalEnd >= nextIntervalFirst) {
        firstIntervalEnd = Math.max(nextIntervalEnd, firstIntervalEnd);
      } else {
        merged.add(new int[] {firstIntervalStart, firstIntervalEnd});
        firstIntervalStart = nextIntervalFirst;
        firstIntervalEnd = nextIntervalEnd;
      }
    }

    merged.add(new int[] {firstIntervalStart, firstIntervalEnd});

    return merged.toArray(new int[merged.size()][]);
  }
}
