package dipayan.practise.problems;

import java.util.*;

public class KStrongestValues {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getStrongest(new int[]{1, 2, 3, 4, 5}, 2))); // 6,6,7,7,8,11
    }

    public static int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);

        Map<Integer, Integer> diffs = new HashMap<>();
        int[] strongest = new int[k];
        int centreIndex = (arr.length - 1) / 2;
        int centreValue = arr[centreIndex];

        for (int i = arr.length - 1; i >= 0; i--) {
            int diff = Math.abs(arr[i] - centreValue);
            diffs.put(i, diff);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(diffs.entrySet());

        entries.sort((e1, e2) -> {
            // compare by abs diff first
            int diffCompare = Integer.compare(e2.getValue(), e1.getValue());
            if (diffCompare != 0) {
                return diffCompare; // higher diff first
            }
            // tie-break by original arr value
            return Integer.compare(arr[e2.getKey()], arr[e1.getKey()]);
        });

        int index1 = 0;

        for (int i = 0; i < entries.size(); i++) {
            if (index1 != k) {
                strongest[index1++] = arr[entries.get(i).getKey()];
            } else {
                break;
            }
        }

        return strongest;
    }
}
