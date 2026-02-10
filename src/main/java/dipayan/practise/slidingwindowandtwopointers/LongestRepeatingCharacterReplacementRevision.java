package dipayan.practise.slidingwindowandtwopointers;

public class LongestRepeatingCharacterReplacementRevision {
  public static void main(String[] args) {}

  public static int characterReplacement(String s, int k) {
    int[] frequency = new int[26];
    char[] chars = s.toCharArray();
    int maxLen = 0;
    int max = 0;
    int right = 0;
    int left = 0;

    while (right < chars.length) {
      int n = chars[right] - 'A';
      frequency[n]++;
      maxLen = Math.max(maxLen, frequency[n]);

      while ((right - left + 1) - maxLen > k) {
        frequency[chars[left] - 'A']--;
        left++;
      }

      max = Math.max(max, right - left + 1);
      right++;
    }

    return max;
  }
}
