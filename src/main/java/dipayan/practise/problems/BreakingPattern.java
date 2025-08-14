package dipayan.practise.problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreakingPattern {
    public static void main(String[] args) {
        int breaker = patternBreaker(List.of(1, 3, 5, 8, 10));

        System.out.println(breaker);
    }

    private static Integer patternBreaker(List<Integer> integers) {
        Map<Integer, Integer> patternMap = new HashMap<>();
        int[] diff = new int[integers.size()];

        for (int i = 0; i < integers.size() - 1; i++) {
            patternMap.put(integers.get(i + 1) - integers.get(i),
                    patternMap.getOrDefault(integers.get(i + 1) - integers.get(i), 0) + 1);
            diff[i] = integers.get(i + 1) - integers.get(i);
        }

        int minKey = patternMap.entrySet().stream().min(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
        int indexOfBreaker = 0;

        for (int i = 0; i < diff.length; i++) {
            if (diff[i] == minKey) {
                indexOfBreaker = i + 1;
            }
        }

        return integers.get(indexOfBreaker);
    }
}
