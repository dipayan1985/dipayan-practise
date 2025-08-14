package dipayan.practise.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatlandSpaceStations {
    public static void main(String[] args) {
        int n = 20;
        int[] c = {13, 1, 11, 10, 6};

        System.out.println(flatlandSpaceStations(n, c));
    }

    static int flatlandSpaceStations(int n, int[] c) {
        if (n == c.length) {
            return 0;
        }

        int maxDistance = Integer.MIN_VALUE;
        List<Integer> sorted = Arrays.stream(c).boxed().sorted().collect(Collectors.toList());

        for (int i = 0; i < sorted.size() - 1; i++) {
            int diff = sorted.get(i + 1) - sorted.get(i);
            int distance = diff / 2;

            if (distance > maxDistance) {
                maxDistance = distance;
            }
        }

        int firstStation = sorted.get(0);
        int firstToFirstStation = Math.abs(firstStation - 0);

        int lastStation = sorted.get(sorted.size() - 1);
        int endToLastStation = n - lastStation - 1;

        return Math.max(maxDistance, Math.max(firstToFirstStation, endToLastStation));
    }
}
