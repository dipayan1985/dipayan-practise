package dipayan.practise.greedy;

public class GasStation {
    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(
                new int[]{1, 2, 3, 4, 5},
                new int[]{3, 4, 5, 1, 2}
        )); // expected 3

        System.out.println(canCompleteCircuit(
                new int[]{2, 3, 4},
                new int[]{3, 4, 3}
        )); // expected -1
    }

    private static int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int totalGas = 0;
        int len = gas.length;

        for (int i = 0; i < len; i++) {
            if (totalGas + gas[i] < cost[i]) {
                start = (i + 1) < len ? (i + 1) : -1;
            } else {
                start = i;
                totalGas += gas[i] - cost[i];
            }
        }

        return start;
    }
}
