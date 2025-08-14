package dipayan.practise.problems.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargestPermutation2 {
    public static void main(String[] args) {
        System.out.println(largestPermutation(1, new ArrayList<>(List.of(1, 2, 3, 4))));
    }

    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
        int n = arr.size();
        int[] arrCopy = arr.stream().mapToInt(i -> i).toArray();
        int[] valueToPos = new int[n + 1];

        for (int i = 0; i < n; i++) {
            valueToPos[arrCopy[i]] = i;
        }

        int swaps = 0;

        for (int i = 0; i < n && swaps < k; i++) {
            int desired = n - i;

            if (arrCopy[i] == desired) {
                continue;
            }

            int desiredIndex = valueToPos[desired];
            valueToPos[arrCopy[i]] = desiredIndex;
            valueToPos[desired] = i;

            swap(i, desiredIndex, arrCopy);
            swaps++;
        }

        return Arrays.stream(arrCopy).boxed().collect(Collectors.toList());
    }

    private static void swap(int index, int i, int[] arrCopy) {
        int temp = arrCopy[index];
        arrCopy[index] = arrCopy[i];
        arrCopy[i] = temp;
    }
}
