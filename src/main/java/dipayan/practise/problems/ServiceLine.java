package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ServiceLine {
    public static void main(String[] args) {
        int n = 8; // Length of service lane (example)
        List<Integer> width = List.of(2, 3, 1, 2, 3, 2, 3, 3); // Example widths

        // List of test cases (each case is a List of two Integers: entry and exit)
        List<List<Integer>> cases = List.of(
                List.of(0, 3),
                List.of(4, 6),
                List.of(6, 7)
        );

        // Call to the serviceLane method
        List<Integer> result = serviceLane(n, width, cases);

        // Output the result (for checking)
        System.out.println(result);
    }

    public static List<Integer> serviceLane(int n, List<Integer> width, List<List<Integer>> cases) {
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < cases.size(); i++) {
            int start = cases.get(i).get(0);
            int end = cases.get(i).get(1);

            int min = width.subList(start, end != width.size() ? end + 1 : end).stream().min(Comparator.comparingInt(o -> o)).get();

            results.add(min);
        }

        return results;
    }
}
