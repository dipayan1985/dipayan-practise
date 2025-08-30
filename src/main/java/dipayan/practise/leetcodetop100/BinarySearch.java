package dipayan.practise.leetcodetop100;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    public static int search(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;

        while (left <= right) {
            int pivot = left + (right - left) / 2;

            if (target == nums[pivot]) {
                return pivot;
            } else if (target > nums[pivot]) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }

        return -1;
    }
}
