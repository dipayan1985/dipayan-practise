package dipayan.practise.problems;

public class Anagram {
    public static void main(String[] args) {
        boolean isAnagram = anagram("ifa", "iaf");

        System.out.println(isAnagram);
    }

    private static boolean anagram(String s1, String s2) {
        int[] frequency = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            frequency[s1.charAt(i) - 'a']++;
            frequency[s2.charAt(i) - 'a']--;
        }

        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
