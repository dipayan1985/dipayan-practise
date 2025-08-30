package dipayan.practise.problems;

import java.util.*;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 1, 3}, 1));
    }

    /*public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> window = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (window.containsKey(nums[i])) {
                window.get(nums[i]).add(i);
            } else {
                List<Integer> positions = new ArrayList<>();

                positions.add(i);
                window.put(nums[i], positions);
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : window.entrySet()) {
            List<Integer> values = entry.getValue();

            if (values.size() > 1) {
                for (int i = 0; i < values.size() - 1; i++) {
                    if (values.get(i + 1) - values.get(i) <= k) {
                        return true;
                    }
                }
            }
        }

        return false;
    }*/

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    }
}
