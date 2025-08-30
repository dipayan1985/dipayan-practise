package dipayan.practise.leetcodetop100;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefixStartFromSmallestPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        String smallestPrefix = Arrays
                .stream(strs)
                .min(Comparator.comparingInt(String::length))
                .orElse("");
        int length = smallestPrefix.length();

        while (!smallestPrefix.isEmpty()) {
            boolean changePrefix = false;

            for (String s : strs) {
                if (!s.startsWith(smallestPrefix)) {
                    length--;
                    smallestPrefix = smallestPrefix.substring(0, length);
                    changePrefix = true;
                    break;
                }
            }

            if (!changePrefix) {
                return smallestPrefix;
            }
        }

        return "";
    }
}
