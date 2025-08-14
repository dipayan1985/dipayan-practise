package dipayan.practise.problems;

import java.util.Comparator;
import java.util.List;

public class MarkAndJane {
    public static void main(String[] args) {

    }

    public static int maximumToys(List<Integer> prices, int k) {
        int numToys = 0;
        int moneySpent = 0;
        prices.sort(Comparator.comparingInt(c -> c));

        for (int price : prices) {
            moneySpent = moneySpent + price;

            if (moneySpent <= k) {
                numToys++;
            } else {
                break;
            }
        }

        return numToys;
    }
}
