package dipayan.practise.problems;

import java.util.ArrayList;
import java.util.List;

public class Encryption2 {
    public static void main(String[] args) {
        System.out.println(encryption("chillout"));
    }

    public static String encryption(String s) {
        int len = s.length();
        double sqrt = Math.sqrt(len);
        int floor = (int) Math.floor(sqrt);
        int ceil = (int) Math.ceil(sqrt);

        List<String> sb = new ArrayList<>();
        int pos = 0;

        for (int i = 0; i < floor; i++) {
            sb.add(s.substring(pos, Math.min(pos + ceil, s.length())));
            pos = pos + ceil;
        }

        if (floor * ceil < s.length()) {
            sb.add(s.substring(pos));
            floor = floor + 1;
        }

        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < ceil; i++) {
            int j = 0;

            while (j < floor) {
                String s1 = sb.get(j);
                encrypted.append(i < s1.length() ? s1.charAt(i) : "");
                j++;
            }

            encrypted.append(" ");
        }

        return encrypted.toString();
    }
}
