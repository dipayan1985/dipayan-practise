package dipayan.practise.problems;

public class CeaserCipher {
    public static void main(String[] args) {
        System.out.println(caesarCipher("_Hello_World!", 4));
    }

    public static String caesarCipher(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int intRep = c - 'a';
            boolean caps = false;

            if (intRep < 0) {
                intRep = c - 'A';

                if (intRep >= 0) {
                    caps = true;
                }
            }

            if (intRep > 0 && intRep <= 25) {
                int newInt = intRep + k;

                if (newInt > 25) {
                    newInt = newInt % 26;
                }

                sb.append(caps ? (char) (newInt + 'A') : (char) (newInt + 'a'));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
