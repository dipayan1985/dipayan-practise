package dipayan.practise.slidingwindowandtwopointers;

import java.util.*;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        System.out.println(findAnagrams("abab", "ab"));
        System.out.println(findAnagramsSlidingWindow("abab", "ab"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int patternLength = p.length();
        int stringLength = s.length();
        List<Integer> anagramPositions = new ArrayList<>();
        int[] frequencies = new int[26];

        for (int i = 0; i < p.length(); i++) {
            frequencies[p.charAt(i) - 'a']++;
        }

        int i = 0;

        while (i <= stringLength - patternLength) {
            int[] windowFrequency = new int[26];
            int k = i;
            int j = i + patternLength;

            while (k < j) {
                windowFrequency[s.charAt(k) - 'a']++;
                k++;
            }

            if (Arrays.equals(windowFrequency, frequencies)) {
                anagramPositions.add(i);
            }

            i++;
        }

        return anagramPositions;
    }

    public static List<Integer> findAnagramsSlidingWindow(String s, String p) {
        if (p.length() > s.length()) {
            return List.of(0);
        }

        List<Integer> anagramPositions = new ArrayList<>();
        int[] patternFrequencies = new int[26];
        int[] windowFrequencies = new int[26];

        for (int i = 0; i < p.length(); i++) {
            patternFrequencies[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i < p.length(); i++) {
            windowFrequencies[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (Arrays.equals(patternFrequencies, windowFrequencies)) {
                anagramPositions.add(i);
            }

            if (i + p.length() < s.length()) {
                windowFrequencies[s.charAt(i) - 'a']--;
                windowFrequencies[s.charAt(i + p.length()) - 'a']++;
            }
        }

        return anagramPositions;
    }
}
