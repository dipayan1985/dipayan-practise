package dipayan.practise.sorting;

public class DecentNumbers {
    public static void main(String[] args) {
        decentNumber(12);
    }

    public static void decentNumber(int n) {
        /*
        Its digits can only be 3's and/or 5's.
The number of 3's it contains is divisible by 5.
The number of 5's it contains is divisible by 3.
It is the largest such number for its length.
18 -> 555333333333333333
         */

        if (n == 1) {
            System.out.println("-1");
        } else {
            if (n < 5) {
                int i = 1;
                int number = 0;

                while (i <= n) {
                    number = (number * 10) + 5; // 5, 55, 555

                    if (i % 3 == 0) {
                        break;
                    }

                    i++;
                }

                System.out.println(number);
            } else {
                int fives = n;

                while (fives % 3 != 0) {
                    fives = fives - 5;
                }

                if (fives < 0) {
                    System.out.println("-1");
                }

                int threes = n - fives;
                int j = 0;
                StringBuilder number = new StringBuilder();

                while (j < fives) {
                    number.append(5);
                    j++;
                }

                int k = 0;

                while (k < threes) {
                    number.append(3);
                    k++;
                }

                System.out.println(number);
            }
        }
    }
}
