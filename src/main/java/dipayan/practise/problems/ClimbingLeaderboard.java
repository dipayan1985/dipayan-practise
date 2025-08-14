package dipayan.practise.problems;

import java.util.*;

public class ClimbingLeaderboard {
    public static void main(String[] args) {
        System.out.println(climbingLeaderboard(List.of(100, 100, 50, 40, 40, 20, 10),
                new ArrayList<>(List.of(5, 25, 50, 120))));
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        Set<Integer> uniqueScores = new TreeSet<>(Comparator.reverseOrder());
        uniqueScores.addAll(ranked);

        List<Integer> uniqueScoreList = new ArrayList<>(uniqueScores);
        List<Integer> ranks = new ArrayList<>();
        int index = uniqueScoreList.size() - 1;

        for (int score : player) {
            while (index >= 0 && score >= uniqueScoreList.get(index)) {
                index--;
            }

            ranks.add(index + 2);
        }

        return ranks;
    }
}
