package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        System.out.println(fullJustify(words, 16));
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> justified = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int remaining = maxWidth;
        int wordsInInteration = 0;

        for (int i = 0; i < words.length; ) {
            if (words[i].length() <= remaining) {
                sb.append(words[i]);
                sb.append(" ");
                wordsInInteration++;
                remaining = maxWidth - sb.length();

                if (i == words.length - 1) {
                    justified.add(sb.toString());
                }

                i++;
            } else {
                sb.deleteCharAt(sb.length() - 1);
                int tempRemaining = maxWidth - sb.length();
                int spaces = tempRemaining / wordsInInteration;
                int extraSpaces = tempRemaining % wordsInInteration;
                justified.add(sb.toString());
                remaining = maxWidth;
                sb.setLength(0);
            }
        }

        return justified;
    }
}
