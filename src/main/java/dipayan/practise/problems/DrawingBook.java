package dipayan.practise.problems;

public class DrawingBook {
    public static void main(String[] args) {
        System.out.println(pageCount(6, 5));
    }

    public static int pageCount(int n, int p) {
        boolean lastPageBothSide = (n - 1) % 2 == 0;

        if (p == 1 || n - 1 == p && lastPageBothSide) {
            return 0;
        }

        int minFlips;
        int frontFlips = p / 2;
        int backFlips = (n - p) / 2 == 0 ? (n - p) % 2 : (n - p) / 2;

        minFlips = Math.min(frontFlips, backFlips);

        return minFlips;
    }
}
