package dipayan.practise.problems;

public class GridSearch2 {
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
                "111111"
        };

        String result = gridSearch(strings, patterns);
        System.out.println(result); // Expected: YES
    }

    private static String gridSearch(String[] strings, String[] patterns) {
        int stringRows = strings.length;
        int patternRows = patterns.length;
        int stringLength = strings[0].length();
        int patternLength = patterns[0].length();

        for (int i = 0; i < stringRows - patternRows; i++) {
            for (int j = 0; j < stringLength - patternLength; j++) {
                boolean match = true;

                for (int k = 0; k < patternRows; k++) {
                    String sub = strings[i + k].substring(j, j + patternLength);

                    if (!sub.equals(patterns[k])) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    return "YES";
                }
            }
        }

        return "NO";
    }
}
