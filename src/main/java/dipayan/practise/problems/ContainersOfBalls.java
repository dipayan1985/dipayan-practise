package dipayan.practise.problems;

import java.util.Arrays;
import java.util.List;

public class ContainersOfBalls {
    public static void main(String[] args) {
        List<List<Integer>> input1 = Arrays.asList(
                Arrays.asList(1, 4),
                Arrays.asList(2, 3)
        );

        System.out.println(organizingContainers(input1));
    }

    public static String organizingContainers(List<List<Integer>> container) {
        int n = container.size();
        int[] containerTotal = new int[n];
        int[] typeTotal = new int[n];

        for (int i = 0; i < container.size(); i++) {
            for (int j = 0; j < container.get(i).size(); j++) {
                containerTotal[i] = containerTotal[i] + container.get(i).get(j);
                typeTotal[i] = typeTotal[i] + container.get(j).get(i);
            }
        }

        return Arrays.equals(containerTotal, typeTotal) ? "Possible" : "Impossible";
    }
}
