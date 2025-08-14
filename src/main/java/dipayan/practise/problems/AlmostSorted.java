package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class AlmostSorted {
    public static void main(String[] args) {
        almostSorted(new ArrayList<>(List.of(1, 5, 9, 3, 2, 6)));
    }

    public static void almostSorted(List<Integer> arr) {
        List<Integer> sorted = new ArrayList<>(arr);
        List<Integer> mismatched = new ArrayList<>();

        sorted.sort(Comparator.comparingInt(c -> c));

        if (arr.equals(sorted)) {
            System.out.println("Yes");
        }

        for (int i = 0; i < arr.size(); i++) {
            if (!Objects.equals(arr.get(i), sorted.get(i))) {
                mismatched.add(i);
            }
        }

        if (mismatched.size() > 2) {
            boolean isSorted = isSorted(mismatched.stream().mapToInt(Integer::intValue).toArray());

            if (!isSorted) {
                System.out.println("No");
            } else {
                List<Integer> reversingSubList = arr.subList(mismatched.get(0), mismatched.get(mismatched.size() - 1) + 1);

                if (isSorted(reversingSubList.stream().mapToInt(Integer::intValue).toArray()) ||
                        isSortedReverse(reversingSubList.stream().mapToInt(Integer::intValue).toArray())) {
                    System.out.println("yes");
                    System.out.println("reverse " + (mismatched.get(0) + 1) + " " + (mismatched.get(mismatched.size() - 1) + 1));

                } else {
                    System.out.println("no");
                }
            }
        } else {
            System.out.println("yes");
            System.out.println("swap " + (mismatched.get(0) + 1) + " " + (mismatched.get(mismatched.size() - 1) + 1));
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSortedReverse(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) { // If any current element is greater than previous, not descending
                return false;
            }
        }
        return true;
    }
}
