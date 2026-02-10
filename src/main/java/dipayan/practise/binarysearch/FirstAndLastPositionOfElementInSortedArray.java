package dipayan.practise.binarysearch;

import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ranges = new int[2];
        int leftIndex = binarySearch(nums, target, true);

        ranges[0] = leftIndex;

        int rightIndex = binarySearch(nums, target, false);

        ranges[1] = rightIndex;

        return ranges;
    }

    private static int binarySearch(int[] nums, int target, boolean leftFind) {
        int left = 0;
        int right = nums.length - 1;
        int found = -1;

        while (left <= right) {
            int pivot = left + (right - left) / 2;

            if (target == nums[pivot]) {
                if (leftFind) {
                    right = pivot - 1;
                } else {
                    left = pivot + 1;
                }

                found = pivot;
            } else if (target > nums[pivot]) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }

        return found;
    }
}
