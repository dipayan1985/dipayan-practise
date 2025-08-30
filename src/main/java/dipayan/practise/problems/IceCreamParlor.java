package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IceCreamParlor {
    public static void main(String[] args) {
        System.out.println(icecreamParlor(6, List.of(1, 3, 4, 5, 6)));
    }

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        List<Integer> indexes = new ArrayList<>();
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            int diff = m - arr.get(i);

            if (indexMap.containsKey(diff)) {
                indexes.add(indexMap.get(diff));
                indexes.add(i + 1);

                return indexes;
            } else {
                indexMap.put(arr.get(i), i + 1);
            }
        }

        return indexes;
    }
}
