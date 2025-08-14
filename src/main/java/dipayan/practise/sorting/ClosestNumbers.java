package dipayan.practise.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClosestNumbers {
    public static void main(String[] args) {
        System.out.println(closestNumbers(new ArrayList<>(List.of(-5, 15, 25, 71, 63))));
    }

    public static List<Integer> closestNumbers(List<Integer> arr) {
        List<Integer> closestList = new ArrayList<>();

        arr.sort(Comparator.comparingInt(c -> c));

        if (arr.size() > 1) {
            int smallestDiff = Integer.MAX_VALUE;

            for (int i = 0; i < arr.size() - 1; i++) {
                int diff = arr.get(i + 1) - arr.get(i);

                if (smallestDiff > diff) {
                    smallestDiff = diff;
                }
            }

            for (int i = 0; i < arr.size() - 1; i++) {
                if (arr.get(i + 1) - arr.get(i) == smallestDiff) {
                    closestList.add(arr.get(i + 1));
                    closestList.add(arr.get(i));
                }
            }

            return closestList;
        } else {
            return new ArrayList<>(arr);
        }
    }
}
