package dipayan.practise.slidingwindowandtwopointers;

import java.util.Arrays;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        characterReplacement("ABAB", 2);
    }

    public static int characterReplacement(String s, int k) {
        int[] frequency = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'A']++;
        }

        Arrays.sort(frequency);
        char biggest = (char) ('A' - frequency[0]);
        int left = 0;
        int highestChar = 0;

        for (int right = 0; right < s.length();) {
           if (s.charAt(right) == highestChar) {
               right++;
           } else {

           }
        }

        return 0;
    }
}
