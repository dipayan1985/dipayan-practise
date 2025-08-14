package dipayan.practise.problems.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargestPermutation {
    public static void main(String[] args) {
        System.out.println(largestPermutation(2, new ArrayList<>(List.of(1, 2, 3, 4))));
    }

    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
        int maxElement = arr.size();
        int[] arrCopy = arr.stream().mapToInt(c -> c).toArray();
        int index = 0;
        int swap = 0;

        for (int i = index; i < arrCopy.length; i++) {
            int elem = arrCopy[index];

            if (swap == k) {
                break;
            }

            if (elem == maxElement) {
                maxElement--;
                index++;
            }

            if (arrCopy[i] == maxElement) {
                swap(index, i, arrCopy);
                maxElement--;
                index++;
                i = index;
                swap++;
            }
        }

        return Arrays.stream(arrCopy)
                .boxed()
                .collect(Collectors.toList());
    }

    private static void swap(int index, int i, int[] arrCopy) {
        int temp = arrCopy[index];
        arrCopy[index] = arrCopy[i];
        arrCopy[i] = temp;
    }
}
