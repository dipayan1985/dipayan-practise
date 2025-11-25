package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    public static void main(String[] args) {
        System.out.println(subsetsWithDup(new int[]{1, 2, 2}));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        Arrays.sort(nums);

        subsets.add(new ArrayList<>());
        subsets.add(new ArrayList<>(List.of(nums[0])));

        List<List<Integer>> lastSubsets = new ArrayList<>();
        lastSubsets.add(new ArrayList<>(List.of(nums[0])));

        for (int i = 1; i < nums.length; i++) {
            List<List<Integer>> newSubsets = new ArrayList<>();

            if (nums[i] != nums[i - 1]) {
                for (List<Integer> subset : subsets) {
                    List<Integer> newSubset = new ArrayList<>(subset);

                    newSubset.add(nums[i]);
                    newSubsets.add(newSubset);
                }
            } else {
                for (List<Integer> subset : lastSubsets) {
                    List<Integer> newSubset = new ArrayList<>(subset);

                    newSubset.add(nums[i]);
                    newSubsets.add(newSubset);
                }
            }

            lastSubsets = newSubsets;
            subsets.addAll(newSubsets);
        }

        return subsets;
    }
}
