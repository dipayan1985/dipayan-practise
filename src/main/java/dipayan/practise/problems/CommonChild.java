package dipayan.practise.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CommonChild {
    public static void main(String[] args) {
        System.out.println(commonChild("WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS", "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC"));
    }

    public static int commonChild(String s1, String s2) {
        Map<Character, Integer> freq = new HashMap<>();
        int len = s1.length();

        for (int i = 0; i < len; i++) {
            freq.put(s1.charAt(i), 1);
        }

        for (int i = 0; i < len; i++) {
            if (freq.containsKey(s2.charAt(i))) {
                freq.put(s2.charAt(i), 2);
            }
        }

        int size = freq.values().stream().filter(v -> v > 1).collect(Collectors.toList()).size();

        return size == len ? size - 1 : size;
    }
}
