package dipayan.practise.slidingwindowandtwopointers;

import java.util.*;

public class DistinctAbsSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1, -1, 2, -2, 3};
        int k = 3;
        List<Integer> res = distinctAbsInWindow(nums, k);
        System.out.println(res); // Output: [2, 2, 3]
    }

    public static List<Integer> distinctAbsInWindow(int[] nums, int k) {
        List<Integer> absList = new ArrayList<>();
        int length = nums.length;
        int i = 0;

        while (i <= length - k) {
            int j = i + k;
            int l = i;
            Set<Integer> absVals = new HashSet<>();

            while (l < j) {
                absVals.add(Math.abs(nums[l]));
                l++;
            }

            absList.add(absVals.size());

            i++;
        }

        return absList;
    }
}
