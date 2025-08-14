package dipayan.practise.sorting;

import java.util.ArrayList;
import java.util.List;

public class Median {
    public static void main(String[] args) {
        int median = findMedian(new ArrayList<>(List.of(0, 1, 2, 4, 6, 5, 3)));

        System.out.println(median);
    }

    public static int findMedian(List<Integer> arr) {
        arr.sort(Integer::compare);

        return arr.get(arr.size() / 2);
    }
}
