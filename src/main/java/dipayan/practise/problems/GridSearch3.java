package dipayan.practise.problems;

import java.util.List;

public class GridSearch3 {
    public static void main(String[] args) {
        List<String> G = List.of(
                "1234567890",
                "0987654321",
                "1111111111",
                "1111111111",
                "2222222222"
        );

        List<String> P = List.of(
                "876543",
                "111111",
                "111111"
        );

        String result = gridSearch(G, P);
        System.out.println(result);
    }

    public static String gridSearch(List<String> G, List<String> P) {
        int row = 0;
        int column = 0;
        int i = 0;
        boolean found = false;

        for (String g : G) {
            if (g.contains(P.get(0))) {
                row = i;
                column = g.indexOf(P.get(0));
                found = true;
            }

            i++;
        }

        if (!found) {
            return "NO";
        }

        for (int j = 1; j < P.size(); j++) {
            int newRow = row + 1;

            for (int k = newRow; k < G.size(); k++) {
                if (!G.get(k).contains(P.get(j)) && G.get(k).indexOf(P.get(j)) != column) {
                    return "NO";
                } else {
                    row = k;
                    break;
                }
            }
        }

        return "YES";
    }
}
