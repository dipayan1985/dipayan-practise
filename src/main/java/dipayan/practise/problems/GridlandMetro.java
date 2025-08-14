package dipayan.practise.problems;

public class GridlandMetro {
    public static void main(String[] args) {
        int n = 4; // number of rows
        int m = 4; // number of columns
        int k = 4; // number of track segments
        int[][] tracks = {
                {1, 1, 4},
                {2, 2, 4},
                {2, 1, 2},
                {4, 2, 3}
        };

        long result = gridlandMetro(n, m, k, tracks);

        System.out.println(result);
    }

    public static long gridlandMetro(int n, int m, int k, int[][] tracks) {
        int maxGrids = n * m;
        int[][] gridland = new int[n][m];

        for (int i = 0; i < tracks.length; i++) {
            int gridStart = tracks[i][1];
            int gridEnd = tracks[i][2];
            int gridToFill = gridEnd - gridStart + 1; //4
            int row = tracks[i][0]; // 1,2,4 -> 0,1,3
            // 0,1,2,3

            int l = 0;

            for (int j = row - 1; j < m; j++) {
                while (gridToFill > 0) {
                    gridland[j][l++] = 1;
                    gridToFill--;
                }
            }
        }

        int freeGrids = 0;
        for (int mm = 0; mm < n; mm++) {
            for (int nn = 0; nn < m; nn++) {
                if (gridland[mm][nn] == 0) {
                    freeGrids++;
                }
            }
        }

        return freeGrids;
    }
}
