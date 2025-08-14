package dipayan.practise.problems;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4}, 1)); // -1,1,2,-4
    }

    public static int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE;
        Arrays.sort(nums); // sort, critical for two pointers

        for (int i = 0; i < nums.length - 2; i++) {
            int third = nums[i];
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = third + nums[j] + nums[k];

                if (sum == target) return sum;

                if (Math.abs(sum - target) < Math.abs(closestSum - target)) { // capture current closest
                    closestSum = sum;
                }

                if (sum < target) { // try to get more closer diffs
                    j++;
                } else {
                    k--;
                }
            }
        }

        return closestSum;
    }
}
