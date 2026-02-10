package dipayan.practise.slidingwindowandtwopointers;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharactersRevision1 {
  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcabcbb"));
  }

  private static int lengthOfLongestSubstring(String string) {
    int i = 0;
    int j = 0;
    int max = 0;
    Set<Character> chars = new HashSet<>();

    while (i < string.length()) {
      if (chars.contains(string.charAt(i))) {
        chars.remove(string.charAt(j));
        j++;
      } else {
        chars.add(string.charAt(i));
        max = Math.max(max, chars.size());
        i++;
      }
    }

    return max;
  }
}
