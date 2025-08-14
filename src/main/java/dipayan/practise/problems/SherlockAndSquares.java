package dipayan.practise.problems;

public class SherlockAndSquares {
    public static void main(String[] args) {
        System.out.println(squares(17, 24));
    }

    public static int squares(int a, int b) {
        int numSquares = 0;
        int sqrta = (int) Math.floor(Math.sqrt(a));
        int sqrtb = (int) Math.ceil(Math.sqrt(b));

        for (int i = sqrta; i <= sqrtb; i++) {
            int num = i * i;

            if (num >= a && num <= b) {
                numSquares++;
            }
        }

        return numSquares;
    }
}
