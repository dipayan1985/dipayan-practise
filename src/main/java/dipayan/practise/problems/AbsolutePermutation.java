package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AbsolutePermutation {
    public static void main(String[] args) {
        System.out.println(absolutePermutation(10, 0));
        System.out.println(absolutePermutation(10, 1));
        System.out.println(absolutePermutation(7, 0));
        System.out.println(absolutePermutation(10, 9));
        System.out.println(absolutePermutation(9, 0));
        System.out.println(absolutePermutation(10, 3));
        System.out.println(absolutePermutation(8, 2));
        System.out.println(absolutePermutation(8, 0));
        System.out.println(absolutePermutation(7, 0));
        System.out.println(absolutePermutation(10, 1));
    }

    public static List<Integer> absolutePermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();

        if (k == 0) {
            for (int i = 1; i <= n; i++) {
                numbers.add(i);
            }

            return numbers;
        }

        if (n % (2 * k) != 0) {
            return Arrays.asList(-1);
        }

        int blocks = n / k;
        int index = 1;

        for (int j = 0; j < blocks; j++) {
            for (int i = 0; i < k; i++) {
                if (j % 2 == 0) {
                    numbers.add(index + k);
                } else {
                    numbers.add(index - k);
                }

                index++;
            }
        }

        return numbers;
    }
}
