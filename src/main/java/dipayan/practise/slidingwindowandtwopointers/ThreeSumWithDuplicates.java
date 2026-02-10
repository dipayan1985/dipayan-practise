package dipayan.practise.slidingwindowandtwopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumWithDuplicates {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                if (first + nums[j] + nums[k] == 0) {
                    triplets.add(List.of(first, nums[j], nums[k]));
                    j++;
                    k--;
                } else if (first + nums[j] + nums[k] > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return triplets;
    }
}
