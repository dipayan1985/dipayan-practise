package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.List;

public class IntervalMerge {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        IntervalMerge solution = new IntervalMerge();
        int[][] result = solution.insert(intervals, newInterval);

        for (int[] interval : result) {
            System.out.println("[" + interval[0] + "," + interval[1] + "]");
        }
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>();
        int i = 0;

        while (i < intervals.length && newInterval[0] > intervals[i][1]) {
            merged.add(intervals[i]);
            i++;
        }

        while (i < intervals.length && intervals[i][0] <= newInterval[0]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        merged.add(newInterval);

        while (i < intervals.length) {
            merged.add(intervals[i]);
            i++;
        }

        return merged.toArray(new int[merged.size()][]); // understand this
    }
}
