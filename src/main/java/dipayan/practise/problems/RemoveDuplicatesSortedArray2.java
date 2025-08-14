package dipayan.practise.problems;

public class RemoveDuplicatesSortedArray2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        int index = removeDuplicates(nums);

        System.out.print("Output: " + index + ", nums = [");
        for (int i = 0; i < nums.length; i++) {
            if (i < index) {
                System.out.print(nums[i]);
            } else {
                System.out.print("_");
            }
            if (i != nums.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index] = nums[i + 1];
                index++;
            }
        }

        return index;
    }
}
