package dipayan.practise.problems.greedy;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedParenthesisString {
  public static void main(String[] args) {
    List<String> tests =
        Arrays.asList(
            "((*)", // * must be ')'
            "(*))", // * must be '('
            "(()*", // * must be ')'
            "(*)", // * can be empty
            "*())(", // invalid
            ")*(", // invalid early ')'
            "***", // all stars
            "(*()*)", // valid mixed
            "((**))", // multiple stars as ')'
            "((*)))", // invalid
            "((*)())" // * as ')'
            );

    for (String s : tests) {
      boolean result = checkValidString(s);
      System.out.println(s + " -> " + result);
    }
  }

  public static boolean checkValidString(String s) {
    Stack<Character> stack = new Stack<>();

    if (s.charAt(0) == ')') {
      return false;
    }

    for (char c : s.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else if (c == ')' || c == '*') {
        char stackTop = stack.peek();

        if (stackTop == '(' || stackTop == '*') {
          stack.pop();
        }
      }
    }

    return stack.isEmpty();
  }
}
