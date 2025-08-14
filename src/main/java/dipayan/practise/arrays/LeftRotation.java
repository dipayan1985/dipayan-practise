package dipayan.practise.arrays;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        rotateLeft(list, 4);
        // 23451
        // 34512
        // 45123
        // 51234
    }

    public static List<Integer> rotateLeft(List<Integer> list, int numRotation) {
        int endIndex = list.size() - 1;

        for (int i = 0; i < numRotation; i++) {
            int firstElement = list.get(0);

            for (int j = 0; j < endIndex; j++) {
                list.set(j, list.get(j + 1));
            }

            list.set(endIndex, firstElement);
        }

        System.out.println(list);

        return list;
    }
}
