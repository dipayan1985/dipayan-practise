package dipayan.practise.problems;

public class RepeatedString2 {
    public static void main(String[] args) {
        System.out.println(repeatedString("abac", 7));
    }

    public static long repeatedString(String s, long n) {
        long numa = 0;
        long repeats = n / s.length();
        long remaining = n % s.length();
        long remainingCount = 0;
        long numaInRemaining = 0;

        for (int i = 0; i < s.length(); i++) {
            remainingCount++;

            if (s.charAt(i) == 'a') {
                numa++;

                if (remainingCount <= remaining) {
                    numaInRemaining++;
                }
            }
        }

        numa = numa * repeats;

        return numa + numaInRemaining;
    }
}
