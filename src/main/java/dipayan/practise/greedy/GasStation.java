package dipayan.practise.greedy;

public class GasStation {
  public static void main(String[] args) {
    System.out.println(
        canCompleteCircuit(new int[] {1, 2, 3, 4, 5}, new int[] {3, 4, 5, 1, 2})); // expected 3

    System.out.println(canCompleteCircuit(new int[] {2, 3, 4}, new int[] {3, 4, 3})); // expected -1
  }

  private static int canCompleteCircuit(int[] gas, int[] cost) {
    int start = 0;
    int totalGas = 0;
    int currentAvailable = 0;
    int len = gas.length;
    int i = 0;

    while (i < len) {
      totalGas += gas[i] - cost[i];
      currentAvailable += gas[i] - cost[i];

      if (currentAvailable < 0) {
        start = i + 1;
        currentAvailable = 0;
      }

      i++;
    }

    if (totalGas >= 0) {
      return start;
    }

    return -1;
  }
}
