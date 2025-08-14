package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        kaprekarNumbers(77778, 77778);
    }

    public static void kaprekarNumbers(int p, int q) {
        List<Integer> kaprekars = new ArrayList<>();

        for (int i = p; i <= q; i++) {
            long sq = (long) i * i;
            String num = String.valueOf(sq);

            if (i > 4 && num.length() % 2 != 0) {
                continue;
            }

            int pivot = num.length() / 2;

            if (Integer.parseInt(num.substring(0, pivot))
                    + Integer.parseInt(num.substring(pivot)) == i) {
                kaprekars.add(i);
            }
        }

        if (kaprekars.isEmpty()) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.println(kaprekars.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" ")));
        }
    }
}
