package dipayan.practise.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pairs {
    public static void main(String[] args) {

    }

    public static int pairs(int k, List<Integer> arr) {
        int match = 0;

       /* for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (Math.abs(arr.get(i) - arr.get(j)) == k) {
                    match++;
                }
            }
        }*/

        Set<Integer> numbers = new HashSet<>(arr);

        for (int a : arr) {
            if (numbers.contains(a + k)) {
                match++;
            }

            if (numbers.contains(a - k)) {
                match++;
            }
        }

        return match / 2;
    }
}
