package dipayan.practise.problems;

import java.util.Arrays;
import java.util.List;

public class FraudulantActivityNotifications2 {
    public static void main(String[] args) {
        System.out.println(activityNotifications(List.of(10, 20, 30, 40, 50), 3));
    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int notices = 0;
        int numChecks = expenditure.size() - d;
        int[] arr = new int[d];

        for (int i = 0; i < numChecks; i++) {
            int k = 0;
            int arrI = 0;

            for (int j = i; j < i + d; j++) {
                arr[arrI++] = expenditure.get(j);
                k = j + 1;
            }

            if (expenditure.get(k) >= findMedian(arr) * 2) {
                notices++;
            }
        }

        return notices;
    }

    public static double findMedian(int[] nums) {
        Arrays.sort(nums); // Sorting in ascending order
        int n = nums.length;

        if (n % 2 != 0) {
            // Odd length, return middle element
            return nums[n / 2];
        } else {
            // Even length, return average of the two middle elements
            return (nums[(n / 2) - 1] + nums[n / 2]) / 2.0;
        }
    }
}
