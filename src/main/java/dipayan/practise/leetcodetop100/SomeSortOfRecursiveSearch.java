package dipayan.practise.leetcodetop100;

import java.util.Arrays;

public class SomeSortOfRecursiveSearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 5, 4, 3, 2, 6, 8, 0}, 4));
    }

    public static int search(int[] nums, int target) {
        Arrays.sort(nums);
        return notBinarySearch(nums, target);
    }

    private static int notBinarySearch(int[] nums, int target) {
        int pivot = nums.length / 2;

        if (target == nums[pivot]) {
            return pivot;
        }

        if (target > nums[pivot]) {
            return notBinarySearch(Arrays.stream(nums, pivot + 1, nums.length).toArray(), target);
        } else {
            return notBinarySearch(Arrays.stream(nums, 0, pivot).toArray(), target);
        }
    }
}
