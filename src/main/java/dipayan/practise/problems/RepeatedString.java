package dipayan.practise.problems;

public class RepeatedString {
    public static void main(String[] args) {
        long result1 = repeatedString("bca", 5);
        System.out.println(result1);
    }

    public static long repeatedString(String s, long n) {
        long a = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                a++;
            }
        }

        long repeats = n / s.length();

        a = a * repeats;

        long left = n - (s.length() * repeats);
        String remaining = s.substring(0, (int) left);

        if (left > 0) {
            for (int i = 0; i < remaining.length(); i++) {
                if (remaining.charAt(i) == 'a') {
                    a++;
                }
            }
        }

        return a;
    }
}
