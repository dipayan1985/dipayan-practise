package dipayan.practise.slidingwindowandtwopointers;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvda"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> characters = new HashSet<>();
        int j = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); ) {
            if (characters.add(s.charAt(i))) {
                maxLength = Math.max(maxLength, characters.size());
                i++;
            } else {
                characters.remove(s.charAt(j));
                j++;
            }
        }

        return Math.max(maxLength, characters.size());
    }
}
