package dipayan.practise.problems.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Candies2 {
    public static void main(String[] args) {
        System.out.println(candies(10, List.of(2, 4, 2, 6, 1, 7, 8, 9, 2, 1)));
    }

    public static long candies(int n, List<Integer> arr) {
        List<Integer> candies = new ArrayList<>(Collections.nCopies(n, 1));
        int seqStart = 0;

        for (int i = 0; i < n - 1; ) {
            int seqEnd;
            int candy = 1;

            if (arr.get(i + 1) >= arr.get(i)) {
                i++;
                continue;
            }

            seqEnd = i;

            while (seqStart <= seqEnd) {
                candies.set(seqStart, candy++);
                seqStart++;
            }

            i++;
        }

        return candies.stream().mapToInt(c -> c).sum();
    }
}
