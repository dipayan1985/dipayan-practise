package dipayan.practise.sorting;

import java.util.ArrayList;
import java.util.List;

public class FraudulentActivityNotifications2 {
    public static void main(String[] args) {
        // int notifications = activityNotifications(new ArrayList<>(List.of(10, 20, 30, 40, 70)), 3);
        int notifications = activityNotifications(new ArrayList<>(List.of(1, 2, 3, 4, 4)), 4);

        System.out.println(notifications);
    }

    private static int activityNotifications(ArrayList<Integer> expenditures, int days) {
        if (expenditures.size() <= days) {
            return 0;
        }

        int[] count = new int[209];
        int notifications = 0;

        for (int i = 0; i < days; i++) {
            count[expenditures.get(i)]++;
        }

        // [0,1,1,1,2]

        for (int i = days; i < expenditures.size(); i++) {
            int median = getMedian(count, days);

            if (expenditures.get(i) >= 2 * median) {
                notifications++;
            }

            count[expenditures.get(i - days)]--;
            count[expenditures.get(i)]++;
        }

        return notifications;
    }

    private static int getMedian(int[] count, int days) {
        int sum = 0;
        int median1 = -1, median2 = -1;
        int mid = days / 2;

        // Find the median using frequency count
        for (int i = 0; i < count.length; i++) {
            sum += count[i];

            if (median1 == -1 && sum >= mid + 1) {
                median1 = i;
            }
            if (days % 2 == 0 && median2 == -1 && sum >= mid) {
                median2 = i;
            }
        }

        return (days % 2 == 0) ? (median1 + median2) / 2 : median1;
    }
}
