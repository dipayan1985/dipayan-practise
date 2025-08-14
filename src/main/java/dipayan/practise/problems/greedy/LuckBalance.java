package dipayan.practise.problems.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LuckBalance {
    public static void main(String[] args) {
        int k = 1;

        List<List<Integer>> contests = new ArrayList<>();
        contests.add(new ArrayList<>(Arrays.asList(5, 1)));
        contests.add(new ArrayList<>(Arrays.asList(1, 1)));
        contests.add(new ArrayList<>(Arrays.asList(4, 0)));

        int result = luckBalance(k, contests);
        System.out.println(result);
    }

    public static int luckBalance(int k, List<List<Integer>> contests) {
        int luckBalance = 0;
        int importantContestsCount = contests.stream().filter(contest -> contest.get(1) == 1).collect(Collectors.toList()).size();

        if (k >= importantContestsCount) {
            luckBalance = contests.stream().mapToInt(contest -> contest.get(0)).sum();
        } else {
            int mustwin = importantContestsCount - k;
            contests
                    .sort(Comparator.comparingInt((List<Integer> contest) -> contest.get(1))
                            .reversed()
                            .thenComparingInt(contest -> contest.get(0)));
            luckBalance = luckBalance + contests.subList(mustwin, contests.size()).stream().mapToInt(contest -> contest.get(0)).sum();
            luckBalance = luckBalance - contests.subList(0, mustwin).stream().mapToInt(contest -> contest.get(0)).sum();
        }

        return luckBalance;
    }
}
