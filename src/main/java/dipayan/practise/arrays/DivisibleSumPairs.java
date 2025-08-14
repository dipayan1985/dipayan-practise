package dipayan.practise.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        int countPairs = divisibleSumPairs(new ArrayList<>(Arrays.asList(5, 7, 9, 5)), 3);

        System.out.println(countPairs);
    }

    private static int divisibleSumPairs(ArrayList<Integer> integers, int divideBy) {
        Map<Integer, Integer> remainderMap = new HashMap<>();
        int count = 0;

        /*for (int i = 0; i < integers.size(); i++) {
            for (int j = i + 1; j < integers.size(); j++) {
                if ((i + j) % divideBy == 0) {
                    count++;
                }
            }
        }*/

        for (int i = 0; i < integers.size(); i++) {
            int value = integers.get(i);
            int remainder = value % divideBy;
            int complement = (divideBy - remainder) % divideBy;

            count += remainderMap.getOrDefault(complement, 0);

            remainderMap.put(remainder, remainderMap.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
}
