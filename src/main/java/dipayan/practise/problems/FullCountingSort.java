package dipayan.practise.problems;

import java.util.*;

public class FullCountingSort {
    public static void main(String[] args) {
        List<List<String>> data = Arrays.asList(
                Arrays.asList("0", "ab"),
                Arrays.asList("6", "cd"),
                Arrays.asList("0", "ef"),
                Arrays.asList("6", "gh"),
                Arrays.asList("4", "ij"),
                Arrays.asList("0", "ab"),
                Arrays.asList("6", "cd"),
                Arrays.asList("0", "ef"),
                Arrays.asList("6", "gh"),
                Arrays.asList("0", "ij"),
                Arrays.asList("4", "that"),
                Arrays.asList("3", "be"),
                Arrays.asList("0", "to"),
                Arrays.asList("1", "be"),
                Arrays.asList("5", "question"),
                Arrays.asList("1", "or"),
                Arrays.asList("2", "not"),
                Arrays.asList("4", "is"),
                Arrays.asList("2", "to"),
                Arrays.asList("4", "the")
        );

        countSort(data);
    }

    public static void countSort(List<List<String>> arr) {
        Map<String, List<String>> countingOrganizer = new TreeMap<>(Comparator.comparingInt(Integer::parseInt));
        int length = arr.size();
        int ignore = length / 2;
        int loopTracker = 0;

        for (List<String> strings : arr) {
            String key = strings.get(0);
            String value = strings.get(1);

            if (!countingOrganizer.containsKey(key)) {
                countingOrganizer.put(key, loopTracker >= ignore ? new ArrayList<>(List.of(value)) : new ArrayList<>(List.of("-")));
            } else {
                countingOrganizer.get(key).add(loopTracker >= ignore ? value : "-");
            }

            loopTracker++;
        }

        StringBuilder sb = new StringBuilder();

        for (List<String> valueList : countingOrganizer.values()) {
            for (String s : valueList) {
                sb.append(s).append(" ");
            }
        }

        // Remove trailing space if needed
        if (!sb.isEmpty()) {
            sb.setLength(sb.length() - 1);
        }

        System.out.println(sb);
    }
}
