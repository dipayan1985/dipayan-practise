package dipayan.practise.greedy;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
    }

    public static int findContentChildren(int[] g, int[] s) {
        int numChild = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0;

        for (int greed : g) {
            while (j < s.length) {
                int size = s[j];

                if (size < greed) {
                    j++;
                } else {
                    j++;
                    numChild++;
                    break;
                }
            }
        }

        return numChild;
    }
}
