package dipayan.practise.problems.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PriyankaAndToys {
    public static void main(String[] args) {
        System.out.println(toys(new ArrayList<>(List.of(1, 2, 3, 7, 12, 14, 21))));
    }

    public static int toys(List<Integer> w) {
        w.sort(Comparator.comparingInt(c -> c));

        int minWeight = w.get(0) + 4;
        int numContainers = 0;

        for (int a : w) {
            if (!(a <= minWeight)) {
                numContainers++;
                minWeight = a + 4;
            }
        }

        return numContainers + 1;
    }
}
