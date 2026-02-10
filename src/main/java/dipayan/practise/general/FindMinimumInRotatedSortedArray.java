package dipayan.practise.general;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int pivot = left + (right - left) / 2;

            if (nums[right] < nums[pivot]) {
                left = pivot + 1;
            } else {
                right = pivot;
            }
        }

        return left;
    }
}
