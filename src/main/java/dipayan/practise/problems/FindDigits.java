package dipayan.practise.problems;

public class FindDigits {
    public static void main(String[] args) {
        System.out.println(findDigits(121));
    }

    public static int findDigits(int n) {
        int copy = n;
        int result = 0;

        while (copy > 0) {
            int divisor = copy % 10;

            if (divisor != 0 && n % divisor == 0) {
                result++;
            }

            copy = copy / 10;
        }
        return result;
    }
}
