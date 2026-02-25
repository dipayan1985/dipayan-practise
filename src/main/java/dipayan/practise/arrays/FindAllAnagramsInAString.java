package dipayan.practise.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
  public static void main(String[] args) {}

  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> anagramPositions = new ArrayList<>();

    if (p.length() > s.length()) {
      return new ArrayList<>();
    }

    int[] patternFrequencies = new int[26];

    for (int i = 0; i < p.length(); i++) {
      patternFrequencies[p.charAt(i) - 'a']++;
    }

    for (int i = 0; i <= s.length() - p.length(); i++) {
      int j = i;
      int k = i + p.length();
      int[] windowFrequencies = new int[26];

      while (j < k) {
        windowFrequencies[s.charAt(j) - 'a']++;
        j++;
      }

      if (Arrays.equals(patternFrequencies, windowFrequencies)) {
        anagramPositions.add(i);
      }
    }

    return anagramPositions;
  }
}
