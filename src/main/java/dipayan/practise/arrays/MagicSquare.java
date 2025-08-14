package dipayan.practise.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MagicSquare {
    public static void main(String[] args) {
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(4, 8, 7),
                Arrays.asList(3, 9, 2),
                Arrays.asList(6, 1, 5)
        );

        int cost = MagicSquare.formingMagicSquare(matrix);
        System.out.println("Minimum Cost to Convert to Magic Square: " + cost);
    }
    public static int formingMagicSquare(List<List<Integer>> list) {
        int cost = 0;

        if (list.get(1).get(1) != 5) {
            int val = list.get(1).get(1);

            cost += val > 5 ? val - 5 : 5 - val;
            list.get(1).set(1, 5);
        }

        for (int i = 0; i < 3; i++) {
            List<Integer> innerList = list.get(i);

            for (int j = 0; j < 3; j++) {
                if (j % 2 == 0) {
                    if (innerList.get(j) % 2 != 0) {
                        if (!innerList.contains(innerList.get(j) + 1)) {
                            innerList.set(j, innerList.get(j) + 1);
                        } else {
                            innerList.set(j, innerList.get(j) - 1);
                        }
                    }
                } else {
                    // handle odd index
                    if (innerList.get(j) % 2 == 0) {
                        if (!innerList.contains(innerList.get(j) + 1)) {
                            innerList.set(j, innerList.get(j) + 1);
                        } else {
                            innerList.set(j, innerList.get(j) - 1);
                        }
                    }
                }
            }
        }

        return cost;
    }
}
