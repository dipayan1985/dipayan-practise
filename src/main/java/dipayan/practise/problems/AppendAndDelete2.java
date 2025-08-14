package dipayan.practise.problems;

public class AppendAndDelete2 {
    public static void main(String[] args) {
        System.out.println(appendAndDelete("ashley", "ash", 9));
    }

    private static String appendAndDelete(String s, String t, int k) {
        int swaps = 0;
        int minLength = Math.min(s.length(), t.length());

        if (s.length() - minLength > k) {
            return "No";
        }

        int i = 0;
        int pointOfMismatch = 0;

        while (i < minLength) {
            if (s.charAt(i) != t.charAt(i)) {
                pointOfMismatch = i;
                break;
            }

            i++;
        }

        if (pointOfMismatch > 0) {
            String first = s.substring(pointOfMismatch);
            String second = t.substring(pointOfMismatch);

            int lengthDiff = first.length() - second.length();

            swaps += lengthDiff;

            int swapsNeeded = first.length() - lengthDiff;

            swaps = swaps + (swapsNeeded * 2);

            return swaps == k ? "YES" : "NO";
        } else {
            int lengthDiff = s.length() - t.length();

            swaps = swaps + lengthDiff;
            return swaps <= k ? "YES" : "NO";
        }
    }
}
