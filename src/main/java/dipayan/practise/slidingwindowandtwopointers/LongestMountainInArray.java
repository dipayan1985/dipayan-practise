package dipayan.practise.slidingwindowandtwopointers;

public class LongestMountainInArray {
  public static void main(String[] args) {}

  public int longestMountain(int[] arr) {
    int longest = 0;
    // mountain will have i-1 < i > i+1

    for (int i = 1; i < arr.length - 1; ) {
      if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
        int right = i + 1;
        int left = i - 1;
        int start;

        while (left > 0 && arr[left - 1] < arr[left]) {
          left--;
        }

        start = left;

        int end;

        while (right < arr.length - 1 && arr[right + 1] < arr[right]) {
          right++;
        }

        end = right;

        longest = Math.max(longest, end - start + 1);
        i = end;
      } else {
        i++;
      }
    }

    return longest;
  }
}
