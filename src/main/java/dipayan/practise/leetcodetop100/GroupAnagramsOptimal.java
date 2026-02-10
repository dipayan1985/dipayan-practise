package dipayan.practise.leetcodetop100;

import java.util.*;

public class GroupAnagramsOptimal {
  public static void main(String[] args) {
    System.out.println(groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> anagrams = new HashMap<>();

    for (String s : strs) {
      char[] chars = s.toCharArray();

      Arrays.sort(chars);
      String sortedString = new String(chars);

      anagrams.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(s);
    }

    return new ArrayList<>(anagrams.values());
  }
}
