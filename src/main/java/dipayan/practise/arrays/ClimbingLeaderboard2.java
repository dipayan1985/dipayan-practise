package dipayan.practise.arrays;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ClimbingLeaderboard2 {
    public static void main(String[] args) {
        System.out.println(climbingLeaderboard(List.of(100, 90, 90, 80), List.of(70, 80, 105)));
    }

    public static List<Integer> climbingLeaderboard(List<Integer> rankedPlayers,
                                                    List<Integer> players) {
        final List<Integer> rankedUniquePlayers = rankedPlayers.stream().distinct().toList();

        return players.stream().map(player -> {
            if (player > rankedUniquePlayers.get(0)) {
                return 1;
            } else if (player < rankedUniquePlayers.get(rankedUniquePlayers.size() - 1)) {
                return rankedUniquePlayers.size() + 1;
            } else if (rankedUniquePlayers.stream().anyMatch(
                    rankedUniquePlayer -> Objects.equals(rankedUniquePlayer, player))) {
                return rankedUniquePlayers.indexOf(player) + 1;
            } else {
                int rank = 1;

                for (Integer rankedPlayer : rankedUniquePlayers) {
                    if (player > rankedPlayer) {
                        rank--;
                    } else {
                        rank++;
                    }
                }

                return rank;
            }
        }).collect(Collectors.toList());
    }
}
