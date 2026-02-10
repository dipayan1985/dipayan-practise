package dipayan.practise.slidingwindowandtwopointers;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        /*Input: s = "ADOBECODEBANC", t = "ABC"
        Output: "BANC"
        Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.*/
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    public static String minWindow(String s, String t) {
        int minLen = Integer.MAX_VALUE;
        Map<Character, Integer> tFreqMap = new HashMap<>();
        char[] tchars = t.toCharArray();
        int right = 0;
        int left = 0;

        for (char tchar : tchars) {
            tFreqMap.put(tchar, tFreqMap.getOrDefault(tchar, 0) + 1);
        }

        int i = 0;
        int j = 0;
        char[] schars = s.toCharArray();
        Map<Character, Integer> sFreqMap = new HashMap<>();

        while (i < schars.length) {
            if (tFreqMap.get(schars[i]) != null && tFreqMap.get(schars[i]) > 0) {
                sFreqMap.put(schars[i], sFreqMap.getOrDefault(schars[i], 0) + 1);
            }

            while (checkWindow(tFreqMap, sFreqMap)) {
                int currentWindow = i - j + 1;

                if (currentWindow < minLen) {
                    minLen = currentWindow;
                    right = i;
                    left = j;
                }

                sFreqMap.put(schars[j], sFreqMap.getOrDefault(schars[j], 0) - 1);

                if (sFreqMap.get(schars[j]) <= 0) {
                    sFreqMap.remove(schars[j]);
                }

                j++;
            }

            i++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(left, right + 1);
    }

    private static boolean checkWindow(Map<Character, Integer> tFreqMap,
                                       Map<Character, Integer> sFreqMap) {
        if (tFreqMap.size() != sFreqMap.size()) {
            return false;
        }

        for (Map.Entry<Character, Integer> keyVal : tFreqMap.entrySet()) {
            if (sFreqMap.get(keyVal.getKey()) != null && !(
                    sFreqMap.get(keyVal.getKey()) >= keyVal.getValue())) {
                return false;
            }
        }

        return true;
    }
}
