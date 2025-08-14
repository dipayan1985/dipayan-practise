package dipayan.practise.problems;

import java.util.List;

public class SubarrayDivision2 {
    public static void main(String[] args) {
        System.out.println(birthday(List.of(2, 2, 1, 3, 1), 4, 2));
    }

    public static int birthday(List<Integer> chocoblock, int days, int month) { //2,2,1,3,2
        int count = 0;

        for (int i = 0; i <= chocoblock.size() - month; i++) {
            int sum = 0;

            for (int j = i; j < i + month; j++) {
                sum = sum + chocoblock.get(j);
            }

            if (sum == days) count++;
        }

        return count;
    }
}
