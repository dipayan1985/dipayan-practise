package dipayan.practise.arrays;

import java.util.ArrayList;
import java.util.List;

public class NonDivisibleSubset {
    public static void main(String[] args) {
        System.out.println(nonDivisibleSubset(3, List.of(1, 7, 2, 4)));
    }

    public static int nonDivisibleSubset(int divideBy, List<Integer> numbers) {
        List<Integer> nonDivisibleList = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if ((numbers.get(i) + numbers.get(j)) % divideBy != 0) {
                    if (!nonDivisibleList.contains(numbers.get(i))) {
                        nonDivisibleList.add(numbers.get(i));
                    }

                    if (!nonDivisibleList.contains(numbers.get(j))) {
                        nonDivisibleList.add(numbers.get(j));
                    }
                }
            }
        }

        return nonDivisibleList.size();
    }
}
