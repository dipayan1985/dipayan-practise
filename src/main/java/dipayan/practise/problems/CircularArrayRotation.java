package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {
    public static void main(String[] args) {
        List<Integer> returnList = circularArrayRotation(new ArrayList<>(List.of(3, 4, 5)), 2, List.of(1, 2));
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> returnList = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            List<Integer> rotatedList = new ArrayList<>();
            int temp = a.get(a.size() - 1);

            rotatedList.add(0, temp);
            rotatedList.addAll(a.subList(0, a.size() - 1));

            a = rotatedList;
        }

        List<Integer> finalA = a;

        queries.forEach(query -> returnList.add(finalA.get(query)));

        return returnList;
    }
}
