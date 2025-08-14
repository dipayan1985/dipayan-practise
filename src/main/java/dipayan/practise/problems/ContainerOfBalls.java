package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ContainerOfBalls {
    public static void main(String[] args) {
        System.out.println(organizingContainers(List.of(List.of(1, 4), List.of(2, 3))));
    }

    public static String organizingContainers(List<List<Integer>> containers) {
        List<Integer> containerSizes = new ArrayList<>();
        List<Integer> totalBallsByTypes = new ArrayList<>();

        for (int i = 0; i < containers.size(); i++) {
            List<Integer> container = containers.get(i);
            int containerSize = 0;
            int totalBallsByType = 0;

            for (int j = 0; j < container.size(); j++) {
                containerSize = containerSize + container.get(j);
                totalBallsByType = totalBallsByType + containers.get(j).get(i);
            }

            totalBallsByTypes.add(totalBallsByType);
            containerSizes.add(containerSize);
        }

        totalBallsByTypes.sort(Comparator.comparingInt(c -> c));
        containerSizes.sort(Comparator.comparingInt(c -> c));

        return totalBallsByTypes.equals(containerSizes) ? "Possible" : "Impossible";
    }
}
