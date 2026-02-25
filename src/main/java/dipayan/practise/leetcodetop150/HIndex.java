package dipayan.practise.leetcodetop150;

import java.util.Arrays;

public class HIndex {
  /*TODO: later*/
  public static void main(String[] args) {
    System.out.println(hIndex(new int[] {100}));
  }

  public static int hIndex(int[] citations) {
    int hIndex = 0;
    int len = citations.length;
    Arrays.sort(citations);
    int[] freqs = new int[citations[len - 1] + 1];

    for (int i = len - 1; i >= 0; i--) {
      freqs[citations[i]] = len - i + ((freqs[citations[i]] > 0) ? 1 : 0);
    }

    for (int h = 0; h < freqs.length; h++) {
      if (freqs[h] >= h) {
        hIndex = h;
      }
    }

    return hIndex;
  }
}
