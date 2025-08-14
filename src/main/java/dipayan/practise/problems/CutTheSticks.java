package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class CutTheSticks {
    public static void main(String[] args) {
        System.out.println(cutTheSticks(new ArrayList<>(List.of(5, 4, 4, 2, 2, 8))));
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> sticksCut = new ArrayList<>();
        int min = arr.stream().mapToInt(i -> i).min().getAsInt();
        int lastMin = 0;

        while (min > 0) {
            int sticks = 0;
            int finalLastMin = lastMin;
            min = arr.stream()
                    .mapToInt(i -> i - finalLastMin)
                    .filter(i -> i > 0)
                    .min()
                    .orElse(0);

            if (min == 0) break;

            for (int a : arr) {
                if (a - lastMin >= min) {
                    sticks++;
                }
            }

            sticksCut.add(sticks);
            lastMin = lastMin + min;
        }

        return sticksCut;
    }

    private static Integer cut(List<Integer> arr) {
        int min = arr.stream().mapToInt(i -> i).min().getAsInt();
        AtomicInteger stickCut = new AtomicInteger();

        arr.stream().mapToInt(stick -> {
            if (stick >= min) {
                stick = stick - min;
                stickCut.getAndIncrement();
            }
            return stick;
        }).boxed().collect(Collectors.toList());

        return stickCut.get();
    }
}
