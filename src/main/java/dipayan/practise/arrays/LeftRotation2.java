package dipayan.practise.arrays;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        System.out.println(rotateLeft(list, 4));
    }

    public static List<Integer> rotateLeft(List<Integer> list, int numRotation) {
        int n = list.size();
        numRotation = numRotation % n;

        List<Integer> rotatedList = new ArrayList<>();

        rotatedList.addAll(list.subList(numRotation, n));
        rotatedList.addAll(list.subList(0, numRotation));

        return rotatedList;
    }
}
