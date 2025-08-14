package dipayan.practise.problems;

public class BeautifulMovieDays {
    public static void main(String[] args) {
        int days = beautifulDays(20, 23, 6);

        System.out.println(days);
    }

    public static int beautifulDays(int i, int j, int k) {
        int days = 0;

        for (int start = i; start <= j; start++) {
            int startCopy = start;
            int reverse = 0;

            while (startCopy != 0) {
                int rem = startCopy % 10;

                reverse = reverse * 10 + rem;
                startCopy = startCopy / 10;
            }

            if (Math.abs(reverse - start) % k == 0) {
                days++;
            }
        }

        return days;
    }
}
