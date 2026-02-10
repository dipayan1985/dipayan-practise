package dipayan.practise.general;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
  public static void main(String[] args) {
    System.out.println(isHappy(19));
  }

  public static boolean isHappy(int n) {
    Set<Integer> seen = new HashSet<>();
    int square = squares(n);
    seen.add(square);

    while (square > 1) {
      square = squares(square);

      if (!seen.add(square)) {
        return false;
      }
    }

    return true;
  }

  public static int squares(int n) {
    int sum = 0;

    while (n > 0) {
      int rem = n % 10;

      sum = sum + (rem * rem);
      n = n / 10;
    }

    return sum;
  }
}
