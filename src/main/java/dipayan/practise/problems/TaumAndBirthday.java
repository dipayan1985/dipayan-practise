package dipayan.practise.problems;

public class TaumAndBirthday {
    public static void main(String[] args) {

    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        int blackCost = Math.min(wc + z, bc);
        int whiteCost = Math.min(bc + z, wc);

        return ((long) b * blackCost) + ((long) w * whiteCost);
    }
}
