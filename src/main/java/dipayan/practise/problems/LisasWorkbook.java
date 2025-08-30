package dipayan.practise.problems;

import java.util.List;

public class LisasWorkbook {
    public static void main(String[] args) {
        System.out.println(workbook(10, 5, List.of(3, 8, 15, 11, 14, 1, 9, 2, 24, 31)));
    }

    public static int workbook(int n, int k, List<Integer> arr) {
        int specialProblems = 0;
        int currentPage = 1;

        for (int a : arr) {
            for (int problemNumber = 1; problemNumber <= a; problemNumber++) {
                if (problemNumber == currentPage) {
                    specialProblems++;
                }

                if (problemNumber % k == 0 || problemNumber == a) {
                    currentPage++;
                }
            }
        }

        return specialProblems;
    }
}
