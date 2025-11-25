package dipayan.practise.leetcodetop100;

public class NextPermutation {
    public static void main(String[] args) {
        nextPermutation(new int[]{3, 2, 1});
    }

    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;

            while (j > i) {
                if (nums[j] > nums[i]) {
                    swap(nums, i, j);
                    break;
                } else {
                    j--;
                }
            }
        }

        reverse(nums, i + 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int i) {
        int j = nums.length - 1;

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
