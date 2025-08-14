package dipayan.practise.problems;

import java.util.List;

public class SubArrayDivision3 {
    public static void main(String[] args) {
        System.out.println(birthday(List.of(1, 2, 1, 3, 2), 3, 2));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int segments = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;

            for (int j = i; j < i + m; j++) {
                sum = sum + s.get(j);
            }

            if (sum == d) {
                segments++;
            }
        }

        return segments;
    }
}
