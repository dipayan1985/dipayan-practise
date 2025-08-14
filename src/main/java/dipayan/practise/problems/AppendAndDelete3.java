package dipayan.practise.problems;

public class AppendAndDelete3 {
    public static void main(String[] args) {
        System.out.println(appendAndDelete3("aba", "aba", 7));
    }

    public static String appendAndDelete3(String s, String t, int k) {
        int commonIndex = 0;
        int commonLength = Math.min(s.length(), t.length());

        if (s.length() - t.length() > k) {
            return "No";
        }

        if (t.length() - s.length() > k) {
            return "No";
        }

        for (int i = 0; i < commonLength; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                commonIndex++;
            } else {
                break;
            }
        }

        int minOps = (s.length() - commonIndex) + (t.length() - commonIndex);

        if (k >= s.length() + t.length()) {
            return "Yes";
        } else if (minOps > k) {
            return "No";
        } else if ((k - minOps) % 2 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
