package dipayan.practise.problems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SherlockString {
    public static void main(String[] args) {
        System.out.println(isValid("aabbccde"));
    }

    public static String isValid(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char aChar : chars) {
            charCountMap.put(aChar, charCountMap.get(aChar) != null ? charCountMap.get(aChar) + 1 : 1);
        }

        int max = charCountMap.values().stream().max(Comparator.comparingInt(a -> a)).get();

        String s1 = charCountMap
                .values()
                .stream()
                .filter(val -> val != max)
                .collect(Collectors.toList())
                .size() > 1 ? "NO" : "YES";

        return s1;
    }
}
