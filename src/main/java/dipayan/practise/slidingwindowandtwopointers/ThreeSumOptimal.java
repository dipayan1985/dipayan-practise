package dipayan.practise.slidingwindowandtwopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumOptimal {
    public static void main(String[] args) {
        // -1,0,1,2,-1,-4
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();

        Arrays.sort(nums); // -4,-1,-1,0,1,2

        for (int i = 0; i < nums.length; i++) {
            int k = nums.length - 1;
            int j = i + 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total == 0) {
                    triplets.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (total > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return triplets;
    }
}
