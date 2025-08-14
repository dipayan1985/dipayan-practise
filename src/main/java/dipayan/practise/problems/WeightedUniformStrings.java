package dipayan.practise.problems;

import java.util.*;

public class WeightedUniformStrings {
    public static void main(String[] args) {
        System.out.println(weightedUniformStrings("abccddde", List.of(1, 3, 12, 5, 9, 10)));
    }

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        int[] freq = new int[s.length()];
        Set<Integer> weights = new LinkedHashSet<>();
        List<String> matches = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int j = 1;

        for (int i = 0; i < freq.length; i++) {
            int count = freq[i];

            for (int k = 1; k <= count; k++) {
                weights.add(j * k);
            }

            j++;
        }

        for (int i = 0; i < queries.size(); i++) {
            if (weights.contains(queries.get(i))) {
                matches.add("Yes");
            } else {
                matches.add("No");
            }
        }

        return matches;
    }
}
