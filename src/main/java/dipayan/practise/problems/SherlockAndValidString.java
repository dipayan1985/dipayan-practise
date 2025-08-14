package dipayan.practise.problems;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndValidString {
    public static void main(String[] args) {
        System.out.println(isValid("aabbcd"));
    }

    public static String isValid(String s) {
        int len = s.length();
        int[] freq = new int[26];

        for (int i = 0; i < len; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        Map<Integer, Integer> freqToCount = new HashMap<>();

        for (int j : freq) {
            if (j > 0) {
                if (!freqToCount.containsKey(j)) {
                    freqToCount.put(j, 1);
                } else {
                    freqToCount.put(j, freqToCount.getOrDefault(j, 0) + 1);
                }
            }
        }

        if (freqToCount.size() > 2) {
            return "NO";
        } else if (freqToCount.size() == 2) {
            return "NO";
        } else if (freqToCount.size() == 1) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
