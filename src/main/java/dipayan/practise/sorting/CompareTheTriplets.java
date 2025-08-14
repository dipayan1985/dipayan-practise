package dipayan.practise.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CompareTheTriplets {
    public static void main(String[] args) {
        System.out.println(compareTriplets(new ArrayList<>(List.of(5, 6, 7)), new ArrayList<>(List.of(3, 6, 10))));
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> compareList = new ArrayList<>(Arrays.asList(0, 0));
        int size = a.size();

        for (int i = 0; i < size; i++) {
            if (!Objects.equals(a.get(i), b.get(i))) {
                if (a.get(i) > b.get(i)) {
                    compareList.set(0, compareList.get(0) + 1);
                } else {
                    compareList.set(1, compareList.get(1) + 1);
                }
            }
        }

        return compareList;
    }
}
