package dipayan.practise.problems;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int sum = nums[i] + nums[j];

            if (sum == target) {
                return new int[]{i + 1, j + 1};
            }

            if (sum > target) {
                j--;
            } else {
                i++;
            }
        }

        return new int[]{i + 1, j + 1};
    }
}
