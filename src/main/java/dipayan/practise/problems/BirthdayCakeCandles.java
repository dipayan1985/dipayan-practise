package dipayan.practise.problems;

import java.util.List;

public class BirthdayCakeCandles {
  public static void main(String[] args) {
    System.out.println(birthdayCakeCandles(List.of(3, 3, 1, 3)));
  }

  public static int birthdayCakeCandles(List<Integer> candles) {
    int tallestCandles = 0;
    int max = 0;

    for (int candle : candles) {
      if (candle > max) {
        max = candle;
        tallestCandles = 1;
      } else if (max == candle) {
        tallestCandles++;
      }
    }

    return tallestCandles;
  }
}
