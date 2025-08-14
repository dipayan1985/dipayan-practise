package dipayan.practise.problems;

public class AppendAndDelete {
    public static void main(String[] args) {
        System.out.println(appendAndDelete("aba", "aba", 5));
    }

    public static String appendAndDelete(String s, String t, int k) {
        int swaps = 0;

        if (s.equals(t)) {
            if (k > s.length() * 2) {
                return "Yes";
            } else {
                return "No";
            }
        }

        int lengthDiff = Math.abs(s.length() - t.length());

        swaps = swaps + lengthDiff;

        for (int i = s.length() - 1 - lengthDiff, j = t.length() - 1; i >= 0 && j >= 0; i--, j--) {
            if (s.charAt(i) != t.charAt(j)) {
                swaps += 2;
            }
        }

        if (swaps > k) {
            return "No";
        } else {
            return "Yes";
        }
    }
}
