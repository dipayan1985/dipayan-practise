package dipayan.practise.problems;

import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        extraLongFactorials(6);
    }

    public static void extraLongFactorials(int n) {
        // n! = n*(n-1)*(n-2)*...*1

        BigInteger result = BigInteger.valueOf(1);

        while (n > 0) {
            result = result.multiply(BigInteger.valueOf(n));
            n = n - 1;
        }

        System.out.println(result);
    }
}
