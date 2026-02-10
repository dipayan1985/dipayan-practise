package dipayan.practise.slidingwindowandtwopointers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {
  public static void main(String[] args) {
    System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
  }

  public static List<String> findRepeatedDnaSequences(String s) {
    Set<String> repeatedSequences = new HashSet<>();
    Set<String> sequences = new HashSet<>();
    int len = s.length();
    int i = 0;
    int j = 9;

    while (i < j && j < len) {
      String sequence = s.substring(i, j + 1);

      if (sequences.contains(sequence)) {
        repeatedSequences.add(sequence);
      } else {
        sequences.add(sequence);
      }

      i++;
      j++;
    }

    return new ArrayList<>(repeatedSequences);
  }
}
