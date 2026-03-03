package dipayan.practise.leetcodetop150;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {
  public static void main(String[] args) {
    int[][] intervals = {
      {1, 2},
      {3, 5},
      {6, 7},
      {8, 10},
      {12, 16}
    };

    int[] newInterval = {4, 8};

    int[][] result = insert(intervals, newInterval);

    for (int[] interval : result) {
      System.out.println("[" + interval[0] + "," + interval[1] + "]");
    }
  }

  public static int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> merged = new ArrayList<>();
    int nStart = newInterval[0];
    int nEnd = newInterval[1];
    boolean newAdded = false;

    for (int i = 0; i < intervals.length; i++) {
      int[] current = intervals[i];
      int cStart = current[0];
      int cEnd = current[1];

      if (cEnd < nStart) {
        merged.add(new int[] {cStart, cEnd});
      } else if (cStart > nEnd) {
        if (!newAdded) {
          merged.add(new int[] {nStart, nEnd});
          newAdded = true;
        }

        merged.add(current);
      } else {
        /*if the new interval start is before the current interval end
        and the new interval end if after the current interval start
        nStart <= cEnd && nEnd >= cStart*/
        nStart = Math.min(cStart, nStart);
        nEnd = Math.max(cEnd, nEnd);
      }
    }

    if (!newAdded) {
      merged.add(new int[] {nStart, nEnd});
    }

    return merged.toArray(new int[merged.size()][]);
  }
}
