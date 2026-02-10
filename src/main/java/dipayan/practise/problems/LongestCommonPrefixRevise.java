package dipayan.practise.problems;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefixRevise {
  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
  }

  public static String longestCommonPrefix(String[] strs) {
    String smallest = Arrays.stream(strs).min(Comparator.comparingInt(String::length)).orElse("");

    while (!smallest.isEmpty()) {
      boolean shorten = false;

      for (String s : strs) {
        if (!s.startsWith(smallest)) {
          shorten = true;
          break;
        }
      }

      if (shorten) {
        smallest = smallest.substring(0, smallest.length() - 1);
      } else {
        return smallest;
      }
    }

    return null;
  }
}
