package dipayan.practise.datastructures;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{1, 1, 2}, new int[]{1, 2, 3})));
    }

    public static int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                result[index++] = nums1[i];
                i++;
            } else {
                result[index++] = nums2[j];
                j++;
            }
        }

        if (i < nums1.length) {
            while (i < nums1.length) {
                result[index++] = nums1[i];
                i++;
            }
        }

        if (j < nums2.length) {
            while (j < nums2.length) {
                result[index++] = nums2[j];
                j++;
            }
        }

        return result;
    }
}
