package dipayan.practise.leetcodetop100;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        int numWays = 0;
        int k = 0;

        while (k * 2 <= n) {
            numWays += nCr(n - k, k);
            k++;
        }

        return numWays;
    }

    private static int nCr(int n, int r) {
        if (r > n) return 0;

        if (r > n - r) r = n - r; // symmetry nCr = nC(n-r)

        long res = 1;

        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }

        return (int) res;
    }
}
