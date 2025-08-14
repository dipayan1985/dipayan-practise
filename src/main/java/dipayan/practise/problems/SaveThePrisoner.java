package dipayan.practise.problems;

public class SaveThePrisoner {
    public static void main(String[] args) {
        System.out.println(saveThePrisoner(6, 10, 4));
    }

    public static int saveThePrisoner(int n, int m, int s) {
        /*int numPrisoners = n;

        n = s - 1;

        while (m > 0) {
            if (n == numPrisoners) {
                n = 1;
                m--;
            } else {
                m--;
                n++;
            }
        }*/

        return ((s - 1 + m - 1) % n) + 1;
    }
}
