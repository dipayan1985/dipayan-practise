package dipayan.practise.problems;

public class UtopianTree {
    public static void main(String[] args) {
        System.out.println(utopianTree(4));
    }

    public static int utopianTree(int n) { //1,2,3,4,5
        int saplingHeight = 1;

        if (n == 0) {
            return saplingHeight;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                saplingHeight = saplingHeight + 1;
            } else {
                saplingHeight = saplingHeight * 2;
            }
        }

        return saplingHeight;
    }
}
