package dipayan.practise.arrays;

import java.util.Arrays;

public class MinimumSwaps {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        int[] sortedArr = arr.clone();
        int swap = 0;

        Arrays.sort(sortedArr);

        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            int sortedElem = sortedArr[i];
            int swapIndex = findIndex(arr, sortedElem);

            if (elem != sortedElem) {
                swap++;
                swap(arr, i, swapIndex);
            }
        }

        System.out.println(swap);
    }

    private static void swap(int[] arr, int i, int swapIndex) {
        int temp = arr[i];
        arr[i] = arr[swapIndex];
        arr[swapIndex] = temp;
    }

    private static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }

        return -1;
    }
}
