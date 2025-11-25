package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3, 4, 5, 6}));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();

        subsets.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList<>();

            for (List<Integer> subset : subsets) {
                List<Integer> newSubset = new ArrayList<>(subset);

                newSubset.add(num);
                newSubsets.add(newSubset);
            }

            subsets.addAll(newSubsets);
        }

        return subsets;
    }
}
