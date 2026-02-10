package dipayan.practise.problems.greedy;

import java.util.Arrays;

public class AssignCookiesOptimalTwoPointers {
  public static void main(String[] args) {
    System.out.println(findContentChildren(new int[] {1, 2, 3}, new int[] {1, 1}));
  }

  public static int findContentChildren(int[] g, int[] s) {
    int numChild = 0;

    Arrays.sort(g);
    Arrays.sort(s);

    int i = 0, j = 0;

    while (i < g.length && j < s.length) {
      if (g[i] >= s[j]) {
        j++;
      } else {
        i++;
        j++;
        numChild++;
      }
    }
    return numChild;
  }
}
