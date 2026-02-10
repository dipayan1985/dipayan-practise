package dipayan.practise.greedy;

import java.util.Arrays;
import java.util.List;

public class MaximumDistanceInArray {
    public static void main(String[] args) {
        List<List<Integer>> arrays = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(1, 2, 3)
        );

        int result = maxDistance(arrays);
        System.out.println(result);
    }

    public static int maxDistance(List<List<Integer>> arrays) {
        int maxDistance = 0;
        List<Integer> firstArray = arrays.get(0);
        int globalMin = firstArray.get(0);
        int globalMax = firstArray.get(firstArray.size() - 1);

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> array = arrays.get(i);
            maxDistance = Math.max(maxDistance, Math.abs(array.get(array.size() - 1) - globalMin));
            maxDistance = Math.max(maxDistance, Math.abs(globalMax - array.get(0)));

            globalMin = Math.min(globalMin, array.get(0));
            globalMax = Math.max(globalMax, array.get(array.size() - 1));
        }

        return maxDistance;
    }
}
