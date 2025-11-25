package dipayan.practise.leetcodetop100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagramGroups = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) {
                continue; // already grouped, skip
            }

            List<String> anagramGroup = new ArrayList<>();
            Set<Character> chars = new HashSet<>();
            String s = strs[i];
            anagramGroup.add(s);
            visited[i] = true;

            for (int k = 0; k < s.length(); k++) {
                chars.add(s.charAt(k));
            }

            for (int j = i + 1; j < strs.length; j++) {
                String s1 = strs[j];

                if (s1.length() != s.length()) {
                    continue;
                }

                if (!visited[j]) {
                    boolean mismatched = false;

                    for (int k = 0; k < s1.length(); k++) {
                        if (!chars.contains(s1.charAt(k))) {
                            mismatched = true;
                            break;
                        }
                    }

                    if (!mismatched) {
                        anagramGroup.add(s1);
                        visited[j] = true;
                    }
                }
            }

            anagramGroups.add(anagramGroup);
        }

        return anagramGroups;
    }
}
