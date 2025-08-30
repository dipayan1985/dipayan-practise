package dipayan.practise.problems;

public class StringSubSequence {
    public static void main(String[] args) {
        System.out.println(subSequence("abcde", new String[]{"aa", "bb", "cde", "ace"}));
    }

    public static int subSequence(String s, String[] words) {
        int validSubSequence = 0;

        for (String word : words) {
            int k = 0; // pointer for s
            int m = 0; // pointer for word

            while (k < s.length() && m < word.length()) {
                if (s.charAt(k) == word.charAt(m)) {
                    m++;
                }

                k++;
            }

            if (m == word.length()) { // matched all characters in word
                validSubSequence++;
            }
        }

        return validSubSequence;
    }
}
