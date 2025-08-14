package dipayan.practise.problems;

import java.util.List;
import java.util.Objects;

public class PickingNumbers2 {
    public static void main(String[] args) {
        System.out.println(pickingNumbers(List.of(
                66, 66, 66, 66, 66, 66, 66, 66, 66, 66,
                66, 66, 66, 66, 66, 66, 66, 66, 66, 66,
                66, 66, 66, 66, 66, 66, 66, 66, 66, 66,
                66, 66, 66, 66, 66, 66, 66, 66, 66, 66,
                66, 66, 66, 66, 66, 66, 66, 66, 66, 66,
                66, 66, 66, 66, 66, 66, 66, 66, 66, 66,
                66, 66, 66, 66, 66, 66, 66, 66, 66, 66,
                66, 66, 66, 66, 66, 66, 66, 66, 66, 66,
                66, 66, 66, 66, 66, 66, 66, 66, 66, 66,
                66, 66, 66, 66, 66, 66, 66, 66, 66, 66)));
    }

    public static int pickingNumbers(List<Integer> a) {
        int max = 0;

        for (int i = 0; i < a.size(); i++) {
            int lessCount = 0;
            int moreCount = 0;
            int oneMore = a.get(i) + 1;
            int oneLess = a.get(i) - 1;

            for (int j = i; j < a.size(); j++) {
                if (a.get(j) == oneMore || Objects.equals(a.get(j), a.get(i))) {
                    moreCount++;
                }

                if (a.get(j) == oneLess || Objects.equals(a.get(j), a.get(i))) {
                    lessCount++;
                }
            }

            if (moreCount >= lessCount && max < moreCount) {
                max = moreCount;
            } else if (lessCount >= moreCount && max < lessCount) {
                max = lessCount;
            }
        }

        return max;
    }
}
