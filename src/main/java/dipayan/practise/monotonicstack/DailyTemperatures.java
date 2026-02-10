package dipayan.practise.monotonicstack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] result = dailyTemperatures(temperatures);

        System.out.println(Arrays.toString(result));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] nextWarmDays = new int[temperatures.length];
        Stack<Integer> monotonic = new Stack<>();

        monotonic.push(0);

        for (int i = 1; i < temperatures.length; i++) {
            while (!monotonic.isEmpty() && temperatures[i] > temperatures[monotonic.peek()]) {
                int poppedIndex = monotonic.pop();
                nextWarmDays[poppedIndex] = i - poppedIndex;
            }

            monotonic.push(i);
        }

        return nextWarmDays;
    }
}

