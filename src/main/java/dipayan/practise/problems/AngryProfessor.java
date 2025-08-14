package dipayan.practise.problems;

import java.util.List;

public class AngryProfessor {
    public static void main(String[] args) {

    }

    public static String angryProfessor(int k, List<Integer> a) {
        int lateArrivals = 0;

        for (int arrival : a) {
            if (arrival > 0) {
                lateArrivals++;
            }
        }

        if (k > a.size() - lateArrivals) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
