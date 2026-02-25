package dipayan.practise.leetcodetop150;

public class MergeSortedArray {
  public static void main(String[] args) {
    merge(new int[] {1, 2, 3, 4, 5, 0, 0}, 5, new int[] {2, 5}, 2);
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int index = m + n - 1;
    int i = m - 1;
    int j = n - 1;

    while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j]) {
        nums1[index--] = nums1[i];
        i--;
      } else {
        nums1[index--] = nums2[j];
        j--;
      }
    }

    while (j >= 0) {
      nums1[index--] = nums2[j--];
    }
  }
}
