package dipayan.practise.leetcodetop150;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
  public static void main(String[] args) {
    System.out.println(summaryRanges(new int[] {0, 2, 3, 4, 6, 8, 9}));
  }

  public static List<String> summaryRanges(int[] nums) {
    List<String> ranges = new ArrayList<>();
    int i = 0;

    while (i < nums.length) {
      int intervalStart = nums[i];
      int nextElementInInterval = intervalStart;
      int j = i + 1;

      while (j < nums.length) {
        int next = nums[j];

        if (nextElementInInterval + 1 == next) {
          nextElementInInterval = next;
          j++;
        } else {
          break;
        }
      }

      /*
      I got stuck here, I was adding the range in the inner while (j) else condition,
      That was preventing, for example, 8 and 9 - the last two elements in the array
      -> 0, 2, 3, 4, 6, 8, 9. The if condition gives the match, but by then j < nums.length
      and never enters the else to add the range in the range list.
      Instead, compute ranges, start in the outer loop, compute in the inner loop,
      print outside inner loop.
       */
      if (nextElementInInterval != intervalStart) {
        ranges.add(intervalStart + "->" + nextElementInInterval);
      } else {
        ranges.add(String.valueOf(intervalStart));
      }

      i = j;
    }

    return ranges;
  }
}
