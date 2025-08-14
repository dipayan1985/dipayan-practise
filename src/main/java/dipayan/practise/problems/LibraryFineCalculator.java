package dipayan.practise.problems;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        int actualDay = 9, actualMonth = 6, actualYear = 2025;
        int expectedDay = 6, expectedMonth = 6, expectedYear = 2025;

        int fine = calculateFine(actualDay, actualMonth, actualYear, expectedDay,
                expectedMonth, expectedYear);

        System.out.println("The library fine is: " + fine);
    }

    public static int calculateFine(int actualDay, int actualMonth, int actualYear,
                                    int expectedDay, int expectedMonth, int expectedYear) {
        if (actualYear > expectedYear) {
            return 10000;
        }

        if (actualYear < expectedYear) {
            return 0;
        } else {
            if (actualMonth > expectedMonth) {
                return 500 * (actualMonth - expectedMonth);
            } else {
                if (actualMonth == expectedMonth && actualDay > expectedDay) {
                    return 15 * (actualDay - expectedDay);
                }
            }
        }

        return 0;
    }
}

