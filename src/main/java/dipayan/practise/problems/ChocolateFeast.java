package dipayan.practise.problems;

public class ChocolateFeast {
    public static void main(String[] args) {
        System.out.println(chocolateFeast(15, 3, 2));
    }

    public static int chocolateFeast(int n, int c, int m) {
        int totalBars = 0;
        int newBars = 0;
        int wrappers;

        totalBars = totalBars + n / c;
        wrappers = totalBars;

        while (wrappers >= m) {
            newBars = wrappers / m;
            totalBars = totalBars + wrappers / m;
            wrappers = wrappers % m;
            wrappers = wrappers + newBars;
        }

        return totalBars;
    }
}
