package dipayan.practise.slidingwindowandtwopointers;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int newLength = removeDuplicates(nums);

        System.out.println("New length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int index = 1;
        int i = 1;

        while (i < len) {
            if (nums[i - 1] != nums[i]) {
                nums[index++] = nums[i];
            }

            i++;
        }

        return index; // placeholder
    }
}
