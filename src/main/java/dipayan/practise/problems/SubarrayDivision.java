package dipayan.practise.problems;

public class SubarrayDivision {
    public static void main(String[] args) {
        int[] chocolateBar = {2, 2, 1, 3, 2}; // Squares with integers
        int birthDay = 4;                    // Ron's birth day
        int birthMonth = 2;                  // Ron's birth month

        int ways = birthdayChocolate(chocolateBar, birthDay, birthMonth);
        System.out.println("Number of ways Lily can share the chocolate: " + ways);
    }

    private static int birthdayChocolate(int[] chocolateBar, int birthDay, int birthMonth) {
        int matches = 0;

        for (int i = 0; i <= chocolateBar.length - birthMonth; i++) {
            int countUntil = i + birthMonth;
            int sum = 0;

            for (int j = i; j < countUntil; j++) {
                sum = sum + chocolateBar[j];
            }

            if (sum == birthDay) {
                matches++;
            }
        }

        return matches;
    }
}
