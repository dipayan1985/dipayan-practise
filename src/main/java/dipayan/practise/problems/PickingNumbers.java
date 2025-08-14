package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {
        int size = longestSubarray(new ArrayList<>(List.of(4, 10, 5, 5, 3, 1)));

        System.out.println(size);
    }

    private static int longestSubarray(List<Integer> integers) {
        int maxLength = 0;

        for (int i : integers) {
            int moreCount = 0;
            int lessCount = 0;

            for (int j : integers) {
                if (j == i || j == i - 1) {
                    lessCount++;
                } else if (j == i + 1) {
                    moreCount++;
                }
            }

            if (lessCount > moreCount && lessCount > maxLength) {
                maxLength = lessCount;
            } else if (moreCount > maxLength) {
                maxLength = moreCount;
            }
        }

        return maxLength;
    }
}
