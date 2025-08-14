package dipayan.practise.arrays;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ClimbingLeaderboard {
    public static void main(String[] args) {
        Set rankedPlayers = new TreeSet((r1, r2) -> Integer.compare((Integer) r2, (Integer) r1));
        rankedPlayers.addAll(List.of(100, 90, 90, 80));

        System.out.println(climbingLeaderboard(rankedPlayers, List.of(70, 80, 105)));
    }

    public static List<Integer> climbingLeaderboard(Set<Integer> rankedPlayers,
                                                    List<Integer> players) {
        return players.stream().map(player -> {
            int rank = 1;

            for (Integer rankedPlayer : rankedPlayers) {
                if (Objects.equals(rankedPlayer, player)) {
                    return rank;
                } else if (rankedPlayer > player) {
                    rank++;
                } else {
                    rank--;

                    if (rank == 0) {
                        rank = 1;
                    }

                    break;
                }
            }

            return rank;
        }).collect(Collectors.toList());
    }
}
