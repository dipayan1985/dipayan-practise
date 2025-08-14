package dipayan.practise.problems;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("xyzracecarabcabacracecarxyz"));
    }

    public static String longestPalindrome(String s) {
        int maxLength = Integer.MIN_VALUE;
        String palindrome = "";

        for (int i = 0; i < s.length(); ) {
            for (int j = s.length() - 1; j >= 0; ) {
                if (s.charAt(i) == s.charAt(j)) {
                    int length = checkPalindrome(s, i, j);

                    if (length > maxLength) {
                        maxLength = length;
                        palindrome = s.substring(i, j + 1);
                    }

                }
                j--;
            }

            i++;
        }

        return palindrome;
    }

    private static int checkPalindrome(String s, int i, int j) {
        char[] chars = s.toCharArray();
        int len = j - i + 1;

        while (i < j) {
            if (chars[i] == chars[j]) {
                i++;
                j--;
            } else {
                return 0;
            }
        }

        return len;
    }
}

