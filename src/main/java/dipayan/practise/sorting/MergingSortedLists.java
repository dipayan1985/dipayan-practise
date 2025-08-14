package dipayan.practise.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergingSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 6, 8);
        List<Integer> list2 = Arrays.asList(2, 3, 5);

        List<Integer> merged = mergeTwoLists(list1, list2);
        System.out.println(merged);
    }

    private static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }

        merged.addAll(list1.subList(i, list1.size()));
        merged.addAll(list2.subList(j, list2.size()));

        return merged;
    }
}
