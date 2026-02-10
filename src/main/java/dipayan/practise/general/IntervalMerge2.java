package dipayan.practise.general;

import java.util.ArrayList;
import java.util.List;

public class IntervalMerge2 {
  public static void main(String[] args) {
    // 1,3 and 6,9, new 2,5
  }

  public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> merged = new ArrayList<>();

    for (int[] interval : intervals) {
      if (interval[1] < newInterval[0]) {
        merged.add(interval); // if intervals the second element is smaller than
        // new intervals first
      } else if (interval[0] > newInterval[1]) {
        merged.add(newInterval); // if intervals the first element is greater than
        // new intervals second
        newInterval = interval;
      } else {
        newInterval[0] = Math.min(interval[0], newInterval[0]);
        newInterval[1] = Math.max(interval[1], newInterval[1]);
      }
    }

    return merged.toArray(new int[merged.size()][]);
  }
}
