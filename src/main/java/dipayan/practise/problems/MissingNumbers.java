package dipayan.practise.problems;

import java.util.*;
import java.util.stream.Collectors;

public class MissingNumbers {
    public static void main(String[] args) {
        System.out.println(missingNumbers(List.of(7, 2, 5, 3, 5, 3), List.of(7, 2, 5, 4, 6, 3, 5, 3)));
    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> numbersToFreqMap = new HashMap<>();

        for (int num : brr) {
            numbersToFreqMap.put(num, numbersToFreqMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (numbersToFreqMap.containsKey(num)) {
                numbersToFreqMap.put(num, numbersToFreqMap.get(num) - 1);
            }
        }

        List<Integer> missingNumbers = new ArrayList<>(numbersToFreqMap.entrySet().stream().map(entry -> {
            if (entry.getValue() >= 1) {
                return entry.getKey();
            }

            return null;
        }).filter(Objects::nonNull).collect(Collectors.toList()));

        missingNumbers.sort(Comparator.comparingInt(c -> c));

        return missingNumbers;
    }
}
