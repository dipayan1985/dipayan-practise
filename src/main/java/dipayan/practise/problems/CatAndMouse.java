package dipayan.practise.problems;

public class CatAndMouse {
    public static void main(String[] args) {

    }

    static String catAndMouse(int x, int y, int z) {
        int catA = Math.abs(z - x);
        int catB = Math.abs(z - y);

        if (catA == catB) {
            return "Mouse C";
        }

        if (catA < catB) {
            return "Cat A";
        } else {
            return "Cat B";
        }
    }
}
