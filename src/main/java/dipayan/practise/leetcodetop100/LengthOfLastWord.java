package dipayan.practise.leetcodetop100;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a"));
    }

    public static int lengthOfLastWord(String s) {
        int strLen = s.length();
        int i = strLen - 1;
        int stringCount = 0;

        while (i >= 0) {
            if (s.charAt(i) != ' ') {
                stringCount = 1;
            } else {
                strLen--;

                if (stringCount == 1) {
                    return strLen - i;
                }
            }

            i--;
        }

        return strLen;
    }
}
