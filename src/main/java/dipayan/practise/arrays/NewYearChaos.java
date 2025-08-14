package dipayan.practise.arrays;

import java.util.Arrays;
import java.util.List;

public class NewYearChaos {
    public static void main(String[] args) {
        Integer q[] = new Integer[]{2, 1, 5, 3, 4};
        int numBribes = 0;

        numBribes(Arrays.asList(q));
    }

    private static void numBribes(List<Integer> q) {
        int numBribes = 0;

        for (int i = q.size() - 1; i >= 0; i--) {
            if (q.get(i) - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            } else {
                if (q.get(i) > (i + 1)) {
                    numBribes = numBribes + (q.get(i) - (i + 1));
                }
            }
        }

        System.out.println(numBribes);
    }
}
