package dipayan.practise.sorting;

import java.util.ArrayList;
import java.util.List;

public class FraudulentActivityNotifications3 {
    public static void main(String[] args) {
        int notifications = activityNotifications(new ArrayList<>(List.of(1, 2, 3, 4, 5)), 3);

        System.out.println(notifications);
    }

    private static int activityNotifications(ArrayList<Integer> expenditures, int days) {
        //1,2,3
        //2,3,4

        // 0 to 1
        for (int i = 0; i < expenditures.size() - days; i++) {
            System.out.println(expenditures.subList(i, days + i)); // 0 to 3, // 1 to 4
            System.out.println("Alert check amount is " + expenditures.get(days + i));
        }

        return 0;
    }
}
