package dipayan.practise.general;

public class RemoveDuplicatesFromASortedArray2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 2, 3, 3, 3};
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
        int i = 0;
        int j = i + 1;
        int counter = 1;

        while (i < nums.length - 1 && j < nums.length) {
            if (nums[i] != nums[j]) {
                nums[index++] = nums[j];
                counter = 1;
            } else {
                if (counter < 2) {
                    nums[index++] = nums[j];
                    counter++;
                }
            }

            i++;
            j++;
        }

        return index;
    }
}
