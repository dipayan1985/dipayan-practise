package dipayan.practise.slidingwindowandtwopointers;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }

    public static String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        int len = s.length();
        int left = len - 1;

        while (left >= 0) {
            while (left >= 0 && s.charAt(left) == ' ') {
                left--;
            }

            if (left < 0) break;

            int right = left;

            while (left >= 0 && s.charAt(left) != ' ') {
                left--;
            }

            if (!reversed.isEmpty()) {
                reversed.append(' ');
            }

            reversed.append(s, left + 1, right + 1);
        }

        return reversed.toString();
    }
}
