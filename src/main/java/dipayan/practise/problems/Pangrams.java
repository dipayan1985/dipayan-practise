package dipayan.practise.problems;

public class Pangrams {
    public static void main(String[] args) {
        System.out.println(pangrams("The quick brown fox jumps over the lazy dog"));
    }

    public static String pangrams(String s) {
        boolean[] seen = new boolean[27];
        int unique = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                seen[26] = true;
            } else {
                if (!seen[s.charAt(i) - 'a']) {
                    unique++;
                    seen[s.charAt(i) - 'a'] = true;
                }
            }

            if (unique == 26) {
                return "pangram";
            }
        }

        return "not pangram";
    }
}
