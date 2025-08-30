package dipayan.practise.problems;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        int reverse = 0;

        while (x > 0) {
            int mod = x % 10;
            reverse = reverse * 10 + mod; // 123 -> (0*10+3=3) -> 12 -> (3*10+2=32) -> 1 -> (32*10+1=321)
            x = x / 10;
        }

        return reverse;
    }
}
