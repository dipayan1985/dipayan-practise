package dipayan.practise.sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    private static void countingSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int[] countingArray = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            countingArray[arr[i]]++;
        }
        // int[] arr = {4, 2, 2, 8, 3, 3, 1};
        // [0,1,2,2,1,0,0,0,1]

        // [0, 1, 2, 2, 1, 0, 0, 0, 1] -> 1,2,2,3,3,4,8

        int j = 0;

        for (int i = 0; i < countingArray.length; i++) {
            int k = countingArray[i];

            for (int l = 0; l < k; l++) {
                arr[j++] = i;
            }
        }
    }
}
