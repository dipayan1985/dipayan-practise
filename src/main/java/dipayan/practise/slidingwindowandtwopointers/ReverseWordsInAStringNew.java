package dipayan.practise.slidingwindowandtwopointers;

public class ReverseWordsInAStringNew {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }

    public static String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        int len = s.length();
        int left = len - 1;

        while (left >= 0) {
            if (s.charAt(left) == ' ') {
                left--;
            } else {
                break;
            }
        }

        int right = left;

        while (left >= 0) {
            while (left >= 0) {
                if (s.charAt(left) != ' ') {
                    left--;
                } else {
                    break;
                }
            }

            if (!reversed.isEmpty()) {
                reversed.append(' ');
            }

            reversed.append(s, left + 1, right + 1);

            while (left >= 0) {
                if (s.charAt(left) == ' ') {
                    left--;
                } else {
                    break;
                }
            }

            right = left;
        }

        return reversed.toString();
    }
}
