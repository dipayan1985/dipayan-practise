package dipayan.practise.problems;

import java.util.*;

public class BullsAndCows {
  public static String getHint(String secret, String guess) {
    Map<Character, List<Integer>> characterAndPositions = new HashMap<>();
    int cows = 0;
    int bulls = 0;

    for (int i = 0; i < secret.length(); i++) {
      characterAndPositions.computeIfAbsent(secret.charAt(i), k -> new ArrayList<>()).add(i);
    }

    for (int i = 0; i < guess.length(); i++) {
      char c = guess.charAt(i);
      List<Integer> positions = characterAndPositions.get(c);

      if (positions != null && !positions.isEmpty()) {
        if (positions.contains(i)) {
          bulls++;
          positions.remove(Integer.valueOf(i));
        } else {
          cows++;
          positions.remove(0);
        }
      }
    }

    return bulls + "A" + cows + "B";
  }

  public static void main(String[] args) {
    BullsAndCows solver = new BullsAndCows();

    String secret = "1807";
    String guess = "7810";

    // String hint = solver.getHint(secret, guess);
    // System.out.println(hint); // Expected output: 1A3B

    System.out.println(solver.getHint("1123", "0111")); // 1A1B
  }
}
