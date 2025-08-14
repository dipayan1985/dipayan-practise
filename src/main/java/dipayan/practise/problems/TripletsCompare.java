package dipayan.practise.problems;

import java.util.*;

public class TripletsCompare {
    static List<Integer> a = new ArrayList<>();
    static List<Integer> b = new ArrayList<>();

    public static void main(String[] args) {
        a.add(10);
        a.add(19);
        a.add(8);

        b.add(11);
        b.add(9);
        b.add(13);

        Map<Integer, Integer> calculations = new HashMap<>();

        for (int i = 0; i < a.size(); i++) {
            if (Objects.equals(a.get(i), b.get(i))) {

            } else if (a.get(i) > b.get(i)) {
                int curr = calculations.get(1) != null ? calculations.get(1) : 0;

                calculations.put(1, curr + 1);
            } else {
                int curr = calculations.get(2) != null ? calculations.get(2) : 0;

                calculations.put(2, curr + 1);
            }
        }

        System.out.println(
                calculations.values()
                        .stream()
                        .sorted(Comparator.reverseOrder()) // Inline comparator for descending order
                        .toList() // Collect sorted values into a list
        );
    }
}
