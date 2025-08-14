package dipayan.practise.problems;

public class NumberLineJumps3 {
    public static void main(String[] args) {
        kangaroo(43, 2, 70, 2);
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 == x2 && v1 == v2) {
            return "YES";
        }

        if ((!(v1 - v2 <= 0)) && (x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        }

        return "NO";
    }
}
