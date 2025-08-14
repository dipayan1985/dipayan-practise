package dipayan.practise.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("(("));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> parenthesis = new Stack<>();
        Map<Character, Character> parenthesisMap = new HashMap<>();
        char[] chars = s.toCharArray();

        parenthesisMap.put('(', ')');
        parenthesisMap.put('{', '}');
        parenthesisMap.put('[', ']');

        for (char c : chars) {
            if (parenthesisMap.get(c) != null) {
                parenthesis.push(c);
            } else {
                if (parenthesis.isEmpty() || c != parenthesisMap.get(parenthesis.pop())) {
                    return false;
                }
            }
        }

        return parenthesis.isEmpty();
    }
}
