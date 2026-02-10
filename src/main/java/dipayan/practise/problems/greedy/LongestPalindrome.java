package dipayan.practise.problems.greedy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ccc"));
    }

    public static int longestPalindrome(String s) {
        int longest = 0;
        Map<Character, Integer> charsToCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (charsToCount.containsKey(c)) {
                charsToCount.put(c, charsToCount.get(c) + 1);
            } else {
                charsToCount.put(c, 1);
            }
        }

        Collection<Integer> values = charsToCount.values();

        boolean oneOdd = false;

        for (int i : values) {
            if (i % 2 > 0) {
                longest += (i - 1);
                oneOdd = true;
            } else {
                longest += i;
            }
        }

        if (oneOdd) {
            longest += 1;
        }

        return longest;
    }
}
