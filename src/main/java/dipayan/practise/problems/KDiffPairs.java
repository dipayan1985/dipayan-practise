package dipayan.practise.problems;

import java.util.Arrays;

public class KDiffPairs {
    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    }

    public static int findPairs(int[] nums, int k) {
        int numPairs = 0;

        Arrays.sort(nums); //1,1,3,4,5

        int i = 0;
        int lastExpected = Integer.MIN_VALUE;

        while (i < nums.length - 1) {
            int expected = nums[i] + k;
            int j = i + 1;

            while (j < nums.length) {
                if (nums[j] == expected && lastExpected != expected) {
                    lastExpected = expected;
                    numPairs++;
                    break;
                }

                j++;
            }

            i++;
        }

        return numPairs;
    }
}
