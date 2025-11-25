package dipayan.practise.slidingwindowandtwopointers;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        System.out.println(totalFruit(new int[]{1, 2, 3, 2, 2}));
    }

    public static int totalFruit(int[] fruits) {
        int total = 0;
        Map<Integer, Integer> fruitTypeToCountMap = new HashMap<>();

        int left = 0;
        int right = 0;

        while (right < fruits.length) {
            if (fruitTypeToCountMap.containsKey(fruits[right])) {
                fruitTypeToCountMap.put(fruits[right], fruitTypeToCountMap.getOrDefault(fruits[right], 0) + 1);
            } else {
                fruitTypeToCountMap.put(fruits[right], 1);
            }

            while (fruitTypeToCountMap.size() > 2) {
                fruitTypeToCountMap.put(fruits[left], fruitTypeToCountMap.get(fruits[left]) - 1);

                if (fruitTypeToCountMap.get(fruits[left]) == 0) {
                    fruitTypeToCountMap.remove(fruits[left]);
                }

                left++;
            }

            total = Math.max(total, right - left + 1);
            right++;
        }

        return total;
    }
}
