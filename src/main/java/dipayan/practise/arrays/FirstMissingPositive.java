package dipayan.practise.arrays;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{0, 2, 2, 1, 1}));
    }

    public static int firstMissingPositive(int[] nums) {
        int len = nums.length;
        int positiveNum = 1;

        Arrays.sort(nums);

        for (int i = 0; i < len; i++) {
            if (nums[i] <= 0) {
                continue;
            }

            if (i + 1 < len && nums[i] == nums[i + 1]) {
                continue;
            }

            if (nums[i] == positiveNum) {
                positiveNum++;
            } else {
                return positiveNum;
            }
        }

        return positiveNum;
    }
}
