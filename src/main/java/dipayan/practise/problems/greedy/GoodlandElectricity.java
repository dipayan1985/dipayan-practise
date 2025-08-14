package dipayan.practise.problems.greedy;

import java.util.List;

public class GoodlandElectricity {
    public static void main(String[] args) {
        System.out.println(pylons(3, List.of(0, 1, 0, 0, 0, 1, 1, 1, 1, 1)));
        System.out.println(pylons(2, List.of(0, 1, 0, 0, 0, 1, 0)));
        System.out.println(pylons(2, List.of(0, 1, 1, 1, 1, 0)));
    }

    public static int pylons(int k, List<Integer> arr) {
        int pp = 0;
        int plantPos = 0;

        for (int i = plantPos; i < arr.size(); ) {
            plantPos = Math.min(i + k - 1, arr.size() - 1);

            while (plantPos >= i - k + 1 && plantPos >= 0 && arr.get(plantPos) != 1) {
                plantPos--;
            }

            if (plantPos < i - k + 1) {
                return -1;
            }

            pp++;
            i = plantPos + k;
        }

        return pp;
    }
}
