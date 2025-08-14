package dipayan.practise.problems;

import java.util.List;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(List.of(0, 0, 0, 1, 0, 0)));
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;

        for (int i = 0; i < c.size() - 1; i++) {
            if (i + 2 < c.size() && c.get(i + 2) == 0) {
                jumps++;
                i++;
            } else if (c.get(i + 1) == 0) {
                jumps++;
            } else {
                return 0;
            }
        }

        return jumps;
    }
}
