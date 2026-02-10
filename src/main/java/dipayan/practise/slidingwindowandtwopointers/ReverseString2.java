package dipayan.practise.slidingwindowandtwopointers;

public class ReverseString2 {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 1));
    }

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i += 2 * k) {
            int from = i;
            int to = Math.min(i + k - 1, chars.length - 1);

            while (from < to) {
                char temp = chars[from];
                chars[from] = chars[to];
                chars[to] = temp;
                from++;
                to--;
            }
        }

        return new String(chars);
    }
}
