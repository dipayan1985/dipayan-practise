package dipayan.practise.problems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EqualizeArray {
    public static void main(String[] args) {
        System.out.println(equalizeArray(List.of(1, 2, 2, 2, 3)));
    }

    public static int equalizeArray(List<Integer> arr) {
        int[] frequency = new int[Collections.max(arr) + 1];

        for (int a : arr) {
            frequency[a]++;
        }

        int max = Arrays.stream(frequency).boxed().max(Comparator.comparingInt(i -> i)).get();

        return arr.size() - max;
    }
}
