package dipayan.practise.problems;

public class SortColors {
    public static void main(String[] args) {
        sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }

    public static void sortColors(int[] nums) {
        int count[] = new int[3];
        int index = 0;

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 0; i < count.length; i++) {
            int k = count[i];

            for (int j = 0; j < k; j++) {
                nums[index++] = i;
            }
        }
    }
}
