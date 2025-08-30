package dipayan.practise.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        Map<Integer, Integer> indexToNum = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diffToTarget = target - nums[i];

            if (indexToNum.containsKey(diffToTarget)) {
                return new int[]{indexToNum.get(diffToTarget), i};
            } else {
                indexToNum.put(nums[i], i);
            }
        }

        return indexes;
    }
}
