package dipayan.practise.arrays;

import java.util.*;

public class IsomorphicString {
  public static void main(String[] args) {
    System.out.println(isIsomorphic("egg", "add"));
  }

  public static boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    Map<Character, List<Integer>> sMap = new LinkedHashMap<>();
    Map<Character, List<Integer>> tMap = new LinkedHashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char sc = s.charAt(i);
      char tc = t.charAt(i);

      sMap.computeIfAbsent(sc, k -> new ArrayList<>()).add(i);
      tMap.computeIfAbsent(tc, k -> new ArrayList<>()).add(i);
    }

    if (sMap.size() != tMap.size()) {
      return false;
    }

    List<List<Integer>> sList = new ArrayList<>(sMap.values());
    List<List<Integer>> tList = new ArrayList<>(tMap.values());

    sList.sort(Comparator.comparing(Object::toString));
    tList.sort(Comparator.comparing(Object::toString));

    return sList.equals(tList);
  }
}
