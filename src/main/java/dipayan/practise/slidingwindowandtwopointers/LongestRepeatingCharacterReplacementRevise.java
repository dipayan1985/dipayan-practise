package dipayan.practise.slidingwindowandtwopointers;

public class LongestRepeatingCharacterReplacementRevise {
    public static void main(String[] args) {

    }

    public int characterReplacement(String s, int k) {
        char[] chars = s.toCharArray();
        int[] intsOfChars = new int[26];
        int longest = 0;
        int maxFrequency = 0;
        int right = 0;
        int left = 0;

        while (right < chars.length) {
            intsOfChars[chars[right] - 'A']++;
            maxFrequency = Math.max(maxFrequency, intsOfChars[chars[right] - 'A']);

            while ((right - left + 1) - maxFrequency > k) {
                intsOfChars[chars[left] - 'A']--;
                maxFrequency = Math.max(maxFrequency, intsOfChars[chars[left] - 'A']);
                left++;
            }

            longest = Math.max(longest, right - left + 1);

            right++;
        }

        return longest;
    }
}
