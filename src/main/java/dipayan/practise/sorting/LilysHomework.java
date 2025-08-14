package dipayan.practise.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class LilysHomework {
    public static void main(String[] args) {
        System.out.println(lilysHomework(new ArrayList<>(List.of(3, 4, 2, 5, 1)))); // 54321
    }

    public static int lilysHomework(List<Integer> arr) {
        Map<Integer, Integer> valueToSortedAscIndex = new HashMap<>();
        Map<Integer, Integer> valueToSortedDescIndex = new HashMap<>();
        Map<Integer, Integer> indexMismatchAscMap = new HashMap<>();
        Map<Integer, Integer> indexMismatchDescMap = new HashMap<>();
        List<Integer> sortedAsc = arr.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedDesc = arr.stream().sorted((i1, i2) -> i2 - i1).collect(Collectors.toList());

        for (int i = 0; i < sortedAsc.size(); i++) {
            valueToSortedAscIndex.put(sortedAsc.get(i), i);
        }

        for (int i = 0; i < sortedDesc.size(); i++) {
            valueToSortedDescIndex.put(sortedDesc.get(i), i);
        }

        for (int i = 0; i < arr.size(); i++) {
            int expectedIndex = valueToSortedAscIndex.get(arr.get(i));

            if (expectedIndex != i) {
                indexMismatchAscMap.put(i, expectedIndex);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            int expectedIndex = valueToSortedDescIndex.get(arr.get(i));

            if (expectedIndex != i) {
                indexMismatchDescMap.put(i, expectedIndex);
            }
        }

        int swapsAsc = 0;
        boolean[] visitedAsc = new boolean[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            if (visitedAsc[i] || !indexMismatchAscMap.containsKey(i)) {
                continue;
            }

            int cycleLength = 0;
            int j = i;

            while (!visitedAsc[j]) {
                visitedAsc[j] = true;
                j = indexMismatchAscMap.get(j);
                cycleLength++;
            }

            if (cycleLength > 0) {
                swapsAsc += (cycleLength - 1);
            }
        }

        int swapsDesc = 0;
        boolean[] visitedDesc = new boolean[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            if (visitedDesc[i] || !indexMismatchDescMap.containsKey(i)) {
                continue;
            }

            int cycleLength = 0;
            int j = i;

            while (!visitedDesc[j]) {
                visitedDesc[j] = true;
                j = indexMismatchDescMap.get(j);
                cycleLength++;
            }

            if (cycleLength > 0) {
                swapsDesc += (cycleLength - 1);
            }
        }


        return Math.min(swapsAsc, swapsDesc);
    }
}
