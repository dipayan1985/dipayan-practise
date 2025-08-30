package dipayan.practise.problems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtleastKRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(longestSubstring("aaaaaaaaaaaabcdefghijklmnopqrstuvwzyz", 3));
    }

    public static int longestSubstring(String s, int k) {
        Map<Character, Integer> charCount = new HashMap<>();
        int i = 0;
        int j = 0;
        int len1 = 0;
        int len2 = 0;

        while (i < s.length()) {
            if (charCount.containsKey(s.charAt(i))) {
                charCount.put(s.charAt(i), charCount.getOrDefault(s.charAt(i), 0) + 1);
            } else {
                charCount.put(s.charAt(i), 1);
            }

            i++;
        }

        while (j < s.length()) {
            int count = charCount.get(s.charAt(j));

            if (count < k) {
                len1 = longestSubstring(s.substring(0, j), k);
                len2 = longestSubstring(s.substring(j + 1), k);

                return Math.max(len1, len2);
            }

            j++;
        }

        return s.length();
    }
}
