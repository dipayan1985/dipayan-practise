package dipayan.practise.problems;

public class HalloweenSale {
    public static void main(String[] args) {
        System.out.println(howManyGames(100, 19, 1, 180));
    }

    public static int howManyGames(int p, int d, int m, int s) {
        int numGames = 0;

        while (s >= p) {
            s -= p;
            numGames++;
            p = Math.max(p - d, m);
        }

        return numGames;
    }
}
