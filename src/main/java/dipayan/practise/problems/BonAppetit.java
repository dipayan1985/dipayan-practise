package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BonAppetit {
    public static void main(String[] args) {
        bonAppetit(new ArrayList<>(Arrays.asList(3, 10, 2, 9)), 1, 7);
    }

    public static void bonAppetit(List<Integer> bill, int didntEat, int amountPaid) {
        try {
            bill.remove(didntEat);

            int shareableAmount = bill.stream().mapToInt(Integer::intValue).sum() / 2;

            if (shareableAmount == amountPaid) {
                System.out.println("Bon Appetit");
            } else {
                System.out.println(amountPaid - shareableAmount);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
