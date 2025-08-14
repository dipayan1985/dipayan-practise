package dipayan.practise.sorting;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1, 3, 3, 4, 4};
        int newSize = removeDuplicates(nums);
        System.out.println("New size: " + newSize);

        System.out.print("Modified array: ");

        for (int i = 0; i < newSize; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int size = nums.length;
        int i = 0;
        int index = 1;

        while (i < size - 1) {
            if (nums[i] != nums[i + 1]) {
                nums[index] = nums[i + 1];
                index++;
            }

            i++;
        }

        return index;
    }
}
