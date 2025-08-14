package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.List;

public class ContainerOfBalls2 {
    public static void main(String[] args) {
        organizingContainers(List.of(List.of(1, 4), List.of(2, 3)));
    }

    public static String organizingContainers(List<List<Integer>> container) {
        List<Integer> containerCapacities = new ArrayList<>();
        List<Integer> numBalls = new ArrayList<>();

        for (int i = 0; i < container.size(); i++) {
            int containerCapacity = 0;
            int numBall = 0;

            for (int j = 0; j < container.get(i).size(); j++) {
                containerCapacity = containerCapacity + container.get(i).get(j);
                numBall = numBall + container.get(j).get(i);
            }

            containerCapacities.add(containerCapacity);
            numBalls.add(numBall);
        }

        containerCapacities.sort(Integer::compare);
        numBalls.sort(Integer::compare);

        if (containerCapacities.equals(numBalls)) {
            return "Possible";
        }

        return "Impossible";
    }
}
