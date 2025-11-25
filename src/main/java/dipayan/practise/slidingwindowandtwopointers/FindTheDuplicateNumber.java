package dipayan.practise.slidingwindowandtwopointers;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (binarySearch(nums, nums[i], i)) {
                return i;
            }

            i++;
        }

        return 0;
    }

    private static boolean binarySearch(int[] nums, int target, int index) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target && mid != index) {
                return true;
            }

            if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;

            }
        }
        return false;
    }
}
