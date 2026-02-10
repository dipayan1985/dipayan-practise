package dipayan.practise.slidingwindowandtwopointers;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasketsRedo {
    public static void main(String[] args) {
        System.out.println(totalFruit(new int[]{1, 2, 3, 2, 2}));
    }

    public static int totalFruit(int[] fruits) {
        int max = 0;
        Map<Integer, Integer> baskets = new HashMap<>();
        int i = 0, j = 0;

        while (i < fruits.length) {
            baskets.put(fruits[i], baskets.getOrDefault(fruits[i], 0) + 1);

            while (baskets.size() > 2) {
                baskets.put(fruits[j], baskets.get(fruits[j]) - 1);

                if (baskets.get(fruits[j]) == 0) {
                    baskets.remove(fruits[j]);
                }

                j++;
            }

            max = Math.max(max, i - j + 1);
            i++;
        }

        return max;
    }
}
