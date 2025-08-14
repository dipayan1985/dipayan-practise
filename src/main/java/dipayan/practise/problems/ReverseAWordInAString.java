package dipayan.practise.problems;

public class ReverseAWordInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("world hello"));
    }

    public static String reverseWords(String s) {
        s = s.trim();
        char[] reverseString = new char[s.length()];
        int j = s.length() - 1;
        int index = 0;
        boolean lastBatch = false;

        for (int i = s.length() - 1; i >= 0; ) {
            if (s.charAt(i) != ' ') {
                i--;

                if (i != 0) {
                    continue;
                } else {
                    lastBatch = true;
                }
            } else {
                i--;
            }

            int k;

            if (lastBatch) {
                k = i;
            } else {
                k = i + 2;
            }

            for (; k <= j; k++) {
                reverseString[index++] = s.charAt(k);
            }

            if (!lastBatch) {
                reverseString[index++] = ' ';
            }

            j = i;
        }

        return String.valueOf(reverseString);
    }
}
