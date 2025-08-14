package dipayan.practise.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AlmostSorted {
    public static void main(String[] args) {
        almostSorted(new ArrayList<>(List.of(1, 5, 3, 4, 2)));
    }

    public static void almostSorted(List<Integer> arr) {
        List<Integer> sorted = new ArrayList<>(arr);
        sorted.sort(Integer::compare);

        int n = arr.size();
        int left = 0;
        int right = n - 1;

        for (int i = 0; i < n - 1; i++) {
            if (Objects.equals(arr.get(left), sorted.get(left))) {
                left++;
            }

            if (Objects.equals(arr.get(right), sorted.get(right))) {
                right--;
            }
        }

        if (left >= right) {
            System.out.println("OK");
            return;
        }

        swap(arr, left, right);

        if (arr.equals(sorted)) {
            System.out.println("OK");
        }
    }

    private static void swap(List<Integer> arr, int i, int j) {
        int t = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, t);
    }
}
