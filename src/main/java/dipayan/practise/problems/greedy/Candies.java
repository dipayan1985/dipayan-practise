package dipayan.practise.problems.greedy;

import java.util.Arrays;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
        System.out.println(candies(4, List.of(2, 1, 2, 1)));
    }

    public static long candies(int n, List<Integer> arr) {
        int[] candies = new int[n];
        Arrays.fill(candies, 1);
        int seqStart = 0;
        int seqEnd = 0;

        for (int i = 0; i < n - 1; i++) {
            int maxCandy = 1;

            if (arr.get(i + 1) > arr.get(i)) {
                seqEnd = i + 1;
            } else {
                while (seqStart <= seqEnd) {
                    candies[seqStart] = maxCandy++;
                    seqStart++;
                }

                seqStart = seqEnd + 1;
            }
        }

        for (int i = n - 1; i >= 1; i--) {
            int maxCandy = 1;

            if (arr.get(i) < arr.get(i - 1)) {
                seqEnd = i - 1;
            } else {
                while (seqStart <= seqEnd && seqStart < n) {
                    candies[seqStart] = maxCandy++;
                    seqStart++;
                }

                seqStart = seqEnd - 1;
            }
        }

        return 0L;
    }
}
