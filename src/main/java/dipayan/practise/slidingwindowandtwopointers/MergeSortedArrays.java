package dipayan.practise.slidingwindowandtwopointers;

public class MergeSortedArrays {
  public static void main(String[] args) {
    // [2,3,3,0,0,0], m = 3, nums2 = [1,5,6], n = 3
    merge(
        new int[] {
          4, 5, 6, 0, 0, 0,
        },
        3,
        new int[] {1, 2, 3},
        3);
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int index = m + n - 1;
    int i = m - 1;
    int j = n - 1;

    if (n == 0) {
      return;
    }

    while (i >= 0 && j >= 0) {
      if (nums2[j] >= nums1[i]) {
        nums1[index] = nums2[j];
        index--;
        j--;
      } else {
        nums1[index] = nums1[i];
        i--;
        index--;
      }
    }

    while (j >= 0) {
      nums1[index--] = nums2[j];
      j--;
    }
  }
}
