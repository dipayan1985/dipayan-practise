package dipayan.practise.problems;

import java.util.*;

public class BreakingRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = scores.get(0);
        int max = scores.get(0);
        int minBroken = 0;
        int maxBroken = 0;

        for (int score : scores) {
            if (score < min) {
                min = score;
                minBroken++;
            }

            if (score > max) {
                max = score;
                maxBroken++;
            }
        }

        return Arrays.asList(maxBroken, minBroken);
    }

    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(12, 24, 10, 24);
        List<Integer> result = breakingRecords(scores);

        System.out.println("Max records broken: " + result.get(0));
        System.out.println("Min records broken: " + result.get(1));
    }
}

