package dipayan.practise.problems;

import java.util.*;

public class MinimumDistances {
    public static void main(String[] args) {
        System.out.println(minimumDistances(List.of(3, 2, 1, 2, 3)));
    }

    /*public static int minimumDistances(List<Integer> a) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (Objects.equals(a.get(i), a.get(j))) {
                    if (min > (j - i)) {
                        min = j - i;
                    }

                    break;
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }*/

    public static int minimumDistances(List<Integer> a) {
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < a.size(); i++) {
            if (!frequencyMap.containsKey(a.get(i))) {
                frequencyMap.put(a.get(i), i);
            } else {
                int index = i - frequencyMap.get(a.get(i));

                if (min > index) {
                    min = index;
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
