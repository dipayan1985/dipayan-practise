package dipayan.practise.problems;

import java.util.List;

public class SherlockAndArray {
    public static void main(String[] args) {
        System.out.println(balancedSums(List.of(5, 6, 8, 11)));
    }

    public static String balancedSums(List<Integer> arr) {
        int size = arr.size();
        int totalSum = 0;
        int leftSum = 0;
        int rightSum;

        for (int a : arr) {
            totalSum += a;
        }

        for (int i = 0; i < size; i++) {
            rightSum = totalSum - leftSum - arr.get(i);

            if (leftSum == rightSum) {
                return "YES";
            }

            leftSum = leftSum + arr.get(i);
        }

        return "NO";
    }
}
