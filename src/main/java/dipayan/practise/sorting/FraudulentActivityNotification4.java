package dipayan.practise.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FraudulentActivityNotification4 {
    public static void main(String[] args) {
        activityNotifications(List.of(10, 20, 30, 40, 50), 3);
    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int numberOfNotifications = 0;

        for (int i = 0; i < expenditure.size() - d; i++) {
            double median = getMedian(expenditure.subList(i, i + d));

            if (expenditure.get(i + d) >= 2 * median) {
                numberOfNotifications++;
            }
        }

        return numberOfNotifications;
    }

    private static double getMedian(List<Integer> window) {
        List<Integer> sorted = new ArrayList<>(window);
        Collections.sort(sorted);
        int size = sorted.size();

        if (size % 2 == 1) {
            return sorted.get(size / 2);
        } else {
            return (sorted.get(size / 2 - 1) + sorted.get(size / 2)) / 2.0;
        }
    }
}
