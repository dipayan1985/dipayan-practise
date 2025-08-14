package dipayan.practise.problems.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MarcCakewalk {
    public static void main(String[] args) {
        System.out.println(marcsCakewalk(new ArrayList<>(List.of(5, 10, 7))));
    }

    public static long marcsCakewalk(List<Integer> calorie) {
        long miles = 0L;
        calorie.sort(Comparator.reverseOrder());
        int i = 0;

        for (int cal : calorie) {
            miles = (long) (miles + (Math.pow(2, i)) * cal);
            i++;
        }

        return miles;
    }
}
