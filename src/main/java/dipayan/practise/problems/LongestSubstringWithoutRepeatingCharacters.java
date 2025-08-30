package dipayan.practise.problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvda"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxLength = 0;
        Set<Character> chars = new HashSet<>();

        if (s.isEmpty()) {
            return 0;
        }

        while (j < s.length()) {
            if (chars.add(s.charAt(j))) {
                j++;

                if (chars.size() > maxLength) {
                    maxLength = chars.size();
                }
            } else {
                chars.remove(s.charAt(i));
                i++;
            }
        }

        return maxLength;
    }
}
