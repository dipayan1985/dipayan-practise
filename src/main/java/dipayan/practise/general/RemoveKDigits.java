package dipayan.practise.general;

import java.util.Stack;

public class RemoveKDigits {
  public static void main(String[] args) {
    System.out.println(removeKdigits("1432219", 3));
  }

  public static String removeKdigits(String num, int k) {
    StringBuilder smallestNum = new StringBuilder();
    Stack<Integer> numbers = new Stack<>();

    if (k >= num.length()) {
      return "0";
    }

    for (int i = 0; i < num.length(); i++) {
      int c = num.charAt(i) - '0';

      while (!numbers.isEmpty() && numbers.peek() > c && k > 0) {
        numbers.pop();
        k--;
      }

      numbers.push(c);
    }

    while (k > 0 && !numbers.isEmpty()) {
      numbers.pop();
      k--;
    }

    while (!numbers.isEmpty()) {
      smallestNum.append(numbers.pop());
    }

    smallestNum.reverse();

    while (!smallestNum.isEmpty() && smallestNum.charAt(0) == '0') {
      smallestNum.deleteCharAt(0);
    }

    return smallestNum.isEmpty() ? "0" : smallestNum.toString();
  }
}
