package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        System.out.println(gradingStudents(new ArrayList<>(List.of(73, 67, 38, 33))));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        final List<Integer> revisedGrades = new ArrayList<>();
        // 4, 73, 67, 38, 33

        for (Integer grade : grades) {
            if (grade >= 38) {
                int mulOfFive = grade / 5;
                int nextMulOfFive = (mulOfFive + 1) * 5;

                if (nextMulOfFive - grade < 3) {
                    revisedGrades.add(nextMulOfFive);
                } else {
                    revisedGrades.add(grade);
                }
            } else {
                revisedGrades.add(grade);
            }
        }

        return revisedGrades;
    }
}
