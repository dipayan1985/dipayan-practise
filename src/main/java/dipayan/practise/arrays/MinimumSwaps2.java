package dipayan.practise.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumSwaps2 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        int swaps = minSwaps(arr);
        System.out.println("Minimum swaps needed: " + swaps);
    }

    public static int minSwaps(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];

        // Step 1: Create (value, original index) pairs
        int[][] indexedArr = new int[n][2];
        for (int i = 0; i < n; i++) {
            indexedArr[i][0] = arr[i]; // Value
            indexedArr[i][1] = i;      // Original index
        }

        // Step 2: Sort based on values
        Arrays.sort(indexedArr, Comparator.comparingInt(a -> a[0]));

        int swaps = 0;
        for (int i = 0; i < n; i++) {
            // If already visited or already in the correct position, skip
            if (visited[i] || indexedArr[i][1] == i) continue;

            // Step 3: Count cycle size
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = indexedArr[j][1]; // Move to the original index
                cycleSize++;
            }

            // Step 4: Number of swaps needed for this cycle
            if (cycleSize > 1) swaps += (cycleSize - 1);
        }

        return swaps;
    }
}
