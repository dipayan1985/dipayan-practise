package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        Map<Character, String> phoneMap = new HashMap<>();

        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");

        backtrack(0, digits, combinations, phoneMap, new StringBuilder());

        return combinations;
    }

    private static void backtrack(int index,
                                  String digits,
                                  List<String> results,
                                  Map<Character, String> phoneMap, StringBuilder current) {
        if (index == digits.length()) {
            results.add(current.toString());
            return;
        }

        String chars = phoneMap.get(digits.charAt(index));

        for (int i = 0; i < chars.length(); i++) {
            char c = chars.charAt(i);

            System.out.println("backtracking for " + c);
            current.append(c);
            backtrack(index + 1, digits, results, phoneMap, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
