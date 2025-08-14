package dipayan.practise.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GridSearch {
    public static void main(String[] args) {
        String[] strings = {
                "1234567890",
                "0987654321",
                "1111111111",
                "1111111111",
                "2222222222"
        };

        String[] patterns = {
                "876543",
                "111111",
                "111112"
        };

        String result = gridSearch(strings, patterns);
        System.out.println(result); // Expected: YES
    }

    public static String gridSearch(String[] strings, String[] patterns) {
        int firstMatchIndex = 0;
        int firstMatchPatternStartPosition = 0;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].contains(patterns[0])) {
                firstMatchIndex = i;
                firstMatchPatternStartPosition = strings[i].indexOf(patterns[0]);

                break;
            }
        }

        int k = 1;

        for (int i = 1; i < patterns.length; i++) {
            for (int j = firstMatchIndex + k; j < strings.length; j++) {
                if (strings[j].substring(firstMatchPatternStartPosition).contains(patterns[i])) {
                    k++;
                    break;
                } else {
                    return "NO";
                }
            }
        }

        return "YES";
    }
}
