package dipayan.practise.problems;

public class DistanceBetweenTwoArrays {
    public static void main(String[] args) {
        int result = findTheDistanceValue(
                new int[]{4, 5, 8},
                new int[]{10, 9, 1, 8},
                2
        );

        System.out.println(result);
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int distance = arr1.length;

        for (int i : arr1) {
            for (int j : arr2) {
                int currDiff = Math.abs(j - i);

                if (currDiff <= d) {
                    distance--;
                    break;
                }
            }
        }

        return distance;
    }
}
