package dipayan.practise.sorting;

import java.util.*;

public class FraudulentActivityNotifications {
    public static void main(String[] args) {
        // int notifications = activityNotifications(new ArrayList<>(List.of(10, 20, 30, 40, 70)), 3);
        int notifications = activityNotifications(new ArrayList<>(List.of(1, 2, 3, 4, 4)), 4);

        System.out.println(notifications);
    }

    public static int activityNotifications(List<Integer> expenditure, int days) {
        int notifications = 0;
        int lastIndex = days - 1; // 3

        for (int i = 0; i < expenditure.size() - days; i++) {
            int recordingDays = lastIndex + i; //3
            int eligibleAlertDay = recordingDays + 1; // 4
            int median = findMedian(expenditure.subList(i, recordingDays + 1));

            if (expenditure.get(eligibleAlertDay) >= median * 2) {
                notifications++;
            }
        }

        return notifications;
    }

    public static int findMedian(List<Integer> arr) {
        arr.sort(Integer::compare);

        return arr.get(arr.size() / 2);
    }
}
