package dipayan.practise.problems;

import java.util.Comparator;
import java.util.List;

public class TheHurdleRace {
    public static void main(String[] args) {

    }

    public static int hurdleRace(int k, List<Integer> height) {
        height.sort(Comparator.reverseOrder());

        if (k >= height.get(0)) {
            return 0;
        } else {
            return height.get(0) - k;
        }
    }
}
