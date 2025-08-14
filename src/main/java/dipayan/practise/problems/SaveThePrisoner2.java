package dipayan.practise.problems;

public class SaveThePrisoner2 {
    public static void main(String[] args) {
        System.out.println(saveThePrisoner(3, 7, 3));
    }

    public static int saveThePrisoner(int n, int m, int s) {
        //return (m % n) + s - 1;
        return (m - 1 + s - 1) % n + 1;
    }
}
