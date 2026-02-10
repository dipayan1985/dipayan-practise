package dipayan.practise.general;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    public static int longestConsecutive(int[] nums) {
        int maxSequence = 0;
        Set<Integer> elements = new HashSet<>();

        for (int n : nums) {
            elements.add(n);
        }

        for (int element : elements) {
            int sequence = 0;

            if (!elements.contains(element - 1)) {
                sequence++;
                int next = element;

                while (true) {
                    if (elements.contains(++next)) {
                        sequence++;
                    } else {
                        maxSequence = Math.max(maxSequence, sequence);
                        break;
                    }
                }
            }
        }

        return maxSequence;
    }
}
