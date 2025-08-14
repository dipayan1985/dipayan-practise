package dipayan.practise.sorting;

import java.util.*;

public class LilysHomework2 {
    public static void main(String[] args) {
        System.out.println(lilysHomework(new ArrayList<>(List.of(3, 4, 2, 5, 1)))); //3,15,12,7
    }

    public static int lilysHomework(List<Integer> arr) {
        int swapsAsc;
        int swapsDesc;
        List<Integer> sortedAsc = new ArrayList<>(arr);
        List<Integer> sortedDesc = new ArrayList<>(arr);

        sortedAsc.sort(Comparator.comparingInt(c -> c));
        sortedDesc.sort(Comparator.reverseOrder());

        swapsAsc = swaps(new ArrayList<>(arr), sortedAsc);
        swapsDesc = swaps(new ArrayList<>(arr), sortedDesc);

        return Math.min(swapsAsc, swapsDesc);
    }

    private static int swaps(List<Integer> arr, List<Integer> sorted) {
        Map<Integer, Integer> indexes = new HashMap<>(arr.size());
        int swaps = 0;
        int index = 0;

        for (int s : arr) {
            indexes.put(s, index++);
        }

        for (int i = 0; i < arr.size(); i++) {
            int elem1 = sorted.get(i);
            int elem2 = arr.get(i);

            if (!Objects.equals(elem1, elem2)) {
                int currentIndex = indexes.get(sorted.get(i));

                if (i != currentIndex) {
                    swap(arr, currentIndex, i);
                    indexes.put(elem1, i);
                    indexes.put(elem2, currentIndex);
                    swaps++;
                }
            }

            if (arr.equals(sorted)) {
                return swaps;
            }
        }

        return swaps;
    }

    private static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(j);

        arr.set(j, arr.get(i));
        arr.set(i, temp);
    }
}
