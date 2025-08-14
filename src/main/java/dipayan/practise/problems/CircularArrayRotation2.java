package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation2 {
    public static void main(String[] args) {
        //3,4,5 -> 5,3,4 -> 4,5,3
        //1,2
        //1 -> 4
        //1 -> 5
        System.out.println(circularArrayRotation2(new ArrayList<>(List.of(3, 4, 5)), 2, List.of(1, 2)));
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int newFirst = a.get(a.size() - 1);

            a = a.subList(0, a.size() - 1);
            a.add(0, newFirst);
        }

        for (int query : queries) {
            result.add(a.get(query));
        }
        return result;
    }

    public static List<Integer> circularArrayRotation2(List<Integer> a, int k, List<Integer> queries) {
        if (a.isEmpty()) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        int[] newIndex = new int[a.size()];

        for (int i = 0; i < a.size(); i++) {
            int indexAfterRotation = (i + k) % a.size();

            newIndex[indexAfterRotation] = a.get(i);
        }

        for (int query : queries) {
            result.add(newIndex[query]);
        }

        return result;
    }
}
