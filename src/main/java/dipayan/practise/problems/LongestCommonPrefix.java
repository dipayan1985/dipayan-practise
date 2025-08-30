package dipayan.practise.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flower"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        int numStrings = strs.length;
        int j = 0;
        int k = 0;
        Set<Character> chars = new HashSet<>();
        StringBuilder lcp = new StringBuilder();
        int maxLen = Arrays.stream(strs).mapToInt(String::length).max().orElse(0);

        while (k < maxLen) {
            int alreadyIn = 0;
            int count = 0;
            boolean broken = false;

            for (String str : strs) {
                if (j < str.length()) {
                    char c = str.charAt(j);

                    if (!chars.contains(c)) {
                        chars.add(c);
                        count++;

                        if (count > 1) {
                            broken = true;
                            break;
                        }
                    } else {
                        alreadyIn++;
                    }
                } else {
                    break;
                }

                if (alreadyIn == numStrings - 1) {
                    lcp.append(str.charAt(j));
                }
            }

            if (broken) {
                break;
            }

            k++;
            j++;
            chars.clear();
        }

        return lcp.toString();
    }
}
