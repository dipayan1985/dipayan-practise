package dipayan.practise.problems;

public class ElectronicsShop {
    public static void main(String[] args) {
        int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};
        int budget = 10;

        int moneySpent = getMoneySpent(keyboards, drives, budget);

        System.out.println(moneySpent);
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
        int spending;
        int max = 0;

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                spending = keyboards[i] + drives[j];

                if (spending <= budget && spending > max) {
                    max = spending;
                }
            }
        }

        return max != 0 ? max : -1;
    }
}
