package dipayan.practise.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingPlayers {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        players.add(new Player(100, "Jack"));
        players.add(new Player(100, "Jones"));
        players.add(new Player(120, "Tom"));
        players.add(new Player(30, "Tim"));
        players.add(new Player(150, "Joy"));

        players.sort((o1, o2) -> {
            if (o2.getScore() == o1.getScore()) {
                return o2.getName().compareTo(o1.getName());
            } else {
                return o2.getScore() - o1.getScore();
            }
        });

        players.forEach(System.out::println);
    }

    private static class Player {
        int score;
        String name;

        public Player(int score, String name) {
            this.score = score;
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Player{name='" + name + "', score=" + score + "}";
        }
    }
}
