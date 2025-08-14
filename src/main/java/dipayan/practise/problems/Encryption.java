package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.List;

public class Encryption {
    public static void main(String[] args) {
        String encrypted = encrypt("have a nice day");

        System.out.println(encrypted);
    }

    private static String encrypt(String phrase) {
        List<String> splitted = new ArrayList<>();
        String cleanInput = phrase.replaceAll("\\s", "");
        int length = cleanInput.length();
        int rows = (int) Math.floor(Math.sqrt(length)); //3
        int cols = (int) Math.ceil(Math.sqrt(length)); //4
        int substringStartIndex = 0;
        int substringEndIndex = cols;

        for (int i = 0; i < rows; i++) {
            splitted.add(cleanInput.substring(substringStartIndex, substringEndIndex));

            substringStartIndex = substringEndIndex;
            substringEndIndex = substringEndIndex + cols;
        }

        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < cols; i++) {
            for (String s : splitted) {
                stringBuilder.append(s.charAt(i));
            }
        }

        return stringBuilder.toString();
    }
}
