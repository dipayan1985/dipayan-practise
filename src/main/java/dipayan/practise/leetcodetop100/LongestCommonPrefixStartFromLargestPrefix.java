package dipayan.practise.leetcodetop100;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefixStartFromLargestPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        String longestPrefix = Arrays.stream(strs).max(Comparator.comparingInt(String::length)).orElse("");
        int j = longestPrefix.length();

        while (!longestPrefix.isEmpty()) {
            boolean changePrefix = false;

            for (int i = 0; i < strs.length; i++) {
                if (!strs[i].startsWith(longestPrefix)) {
                    changePrefix = true;
                    break;
                }
            }

            if (changePrefix) {
                j--;
                longestPrefix = longestPrefix.substring(0, j);
            } else {
                return longestPrefix;
            }
        }

        return "";
    }
}
