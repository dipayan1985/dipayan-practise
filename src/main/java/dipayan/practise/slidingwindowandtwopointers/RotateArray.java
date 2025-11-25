package dipayan.practise.slidingwindowandtwopointers;

public class RotateArray {
    public static void main(String[] args) {
        rotate(new int[]{1, 2}, 7);
    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;

        if (length > 1) {
            if (k > length) {
                k = k % length;
            }

            int left = 0;
            int right = length - 1;

            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }

            left = 0;
            right = k - 1;

            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }

            left = k;
            right = length - 1;

            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }
    }
}
