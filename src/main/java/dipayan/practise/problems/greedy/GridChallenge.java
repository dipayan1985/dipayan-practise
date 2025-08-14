package dipayan.practise.problems.greedy;

import java.util.Arrays;
import java.util.List;

public class GridChallenge {
    public static void main(String[] args) {
        System.out.println(gridChallenge(List.of("dbcdd", "adedd", "efgdd")));
    }

    public static String gridChallenge(List<String> grid) {
        int columns = grid.get(0).length();
        int rows = grid.size();
        int[][] arr = new int[rows][columns];
        int i = 0;

        while (i < rows) {
            String elem = grid.get(i);

            for (int j = 0; j < columns; j++) {
                int intRep = elem.charAt(j) - 'a';
                arr[i][j] = intRep;
            }

            Arrays.sort(arr[i]);
            i++;
        }

        for (int k = 0; k < columns; k++) {
            int columnValue = Integer.MIN_VALUE;

            for (int l = 0; l < rows; l++) {
                if (arr[l][k] < columnValue) {
                    return "NO";
                } else {
                    columnValue = arr[l][k];
                }
            }
        }

        return "YES";
    }
}
