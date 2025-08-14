package dipayan.practise.problems;

public class MakingCandies {
    public static void main(String[] args) {
        System.out.println(minimumPasses(3, 1, 2, 12));
    }

    public static long minimumPasses(long m, long w, long p, long n) {
        long candies = m * w;
        long possibleNewBuys = candies / p;
        long expense = possibleNewBuys * p;
        int passes = 0;

        candies = candies - expense;

        while (possibleNewBuys > 0) {
            if (m >= w) {
                w++;
            } else {
                m++;
            }

            possibleNewBuys--;
        }

        candies = candies + (m * w);
        passes++;

        while (candies < n) {
            long newBuys = candies / p;
            long newExpense = newBuys * p;

            candies = candies - newExpense;

            while (newBuys > 0) {
                if (m >= w) {
                    w++;
                } else {
                    m++;
                }

                newBuys--;
            }

            candies = candies + (m * w);
            passes++;
        }

        return passes;
    }
}
