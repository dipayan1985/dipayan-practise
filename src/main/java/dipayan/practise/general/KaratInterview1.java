package dipayan.practise.general;

import java.util.ArrayList;
import java.util.List;

public class KaratInterview1 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 1, 1, 1, 1},
                {1, 1, 0, 0, 1},
                {1, 1, 0, 0, 1},
                {1, 1, 1, 1, 1}
        };

        System.out.println(findRectangle(matrix1));
    }

    public static int[][] findRectangle(int[][] matrix) {
        List<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    pairs.add(new Pair(i, j));
                }
            }
        }

        int i = 0;
        int j = pairs.size() - 1;

        while (i < j) {
            Pair start = pairs.get(i);
            Pair end = pairs.get(j);

            for (int k = start.row + 1; k <= end.row - 1; k++) {
                for (int l = start.column + 1; l <= end.column - 1; l++) {
                    if (matrix[k][l] == 1) {
                        j--;
                    }
                }
            }
        }

        return new int[][]{}; // placeholder
    }

    private static class Pair {
        int row;
        int column;

        Pair(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }
}
