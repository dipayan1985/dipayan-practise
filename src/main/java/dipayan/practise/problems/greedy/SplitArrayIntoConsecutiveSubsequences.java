package dipayan.practise.problems.greedy;

import java.util.HashMap;
import java.util.Map;

public class SplitArrayIntoConsecutiveSubsequences {
    public static void main(String[] args) {
        System.out.println(isPossible(new int[]{1, 2, 3, 3, 4, 5}));
    }

    public static boolean isPossible(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            int count = 0;
            int current = num;

            while (freq.containsKey(current) && freq.get(current) > 0) {
                int currentCount = freq.get(current);

                freq.put(current, currentCount - 1);

                if (freq.get(current) == 0) {
                    freq.remove(current);
                }

                count++;

                if (count == 3) {
                    break;
                } else {
                    current++;
                }
            }

            if (count >= 1 && count < 3) {
                return false;
            }
        }

        return true;
    }
}
