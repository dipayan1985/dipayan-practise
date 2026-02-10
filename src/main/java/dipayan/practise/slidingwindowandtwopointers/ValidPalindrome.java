package dipayan.practise.slidingwindowandtwopointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;

        while (i < j) {
            if (!isAlphanumeric(chars[i])) {
                i++;
            } else if (!isAlphanumeric(chars[j])) {
                j--;
            } else if (chars[i] == chars[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }

    private static boolean isAlphanumeric(char c) {
        return
                (c >= 'a' && c <= 'z') ||
                        (c >= 'A' && c <= 'Z') ||
                        (c >= '0' && c <= '9');
    }
}
