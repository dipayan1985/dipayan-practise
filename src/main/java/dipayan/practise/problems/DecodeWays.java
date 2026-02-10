package dipayan.practise.problems;

public class DecodeWays {
    public static void main(String[] args) {
        System.out.println(numDecodings("11106"));
    }

    public static int numDecodings(String s) {
        return decode(s, 0);
    }

    public static int decode(String s, int n) {
        System.out.println("Decode called with String " + s + " and n is " + n);
        if (n == s.length()) {
            return 1;
        }

        if (s.charAt(n) == '0') {
            return 0;
        }

        int ways = decode(s, n + 1);

        if (n + 1 < s.length()) {
            int val = (s.charAt(n) - '0') * 10 + (s.charAt(n + 1) - '0');

            if (val >= 10 && val <= 26) {
                ways += decode(s, n + 2);
            }
        }

        return ways;
    }
}
