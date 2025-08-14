package dipayan.practise.problems;

public class JumpingOnCloudsRevisited {
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
    }

    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int n = c.length;
        int i = 0;

        while (true) {
            i = (i + k) % n;

            energy -= 1;

            if (c[i] == 1) {
                energy -= 2;
            }

            if (i == 0) {
                break;
            }
        }

        return energy;
    }
}
