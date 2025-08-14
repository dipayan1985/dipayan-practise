package dipayan.practise.problems;

public class HurdleRace {
    public static void main(String[] args) {
        int k = 4; // character's initial jump height
        int[] height = {1, 6, 3, 5, 2}; // hurdle heights

        System.out.println(calculatePotion(height, k));
    }

    private static int calculatePotion(int[] height, int k) {
        int max = height[0];

        for (int i = 1; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }

        if (max > k) {
            return max - k;
        }

        return max;
    }
}
