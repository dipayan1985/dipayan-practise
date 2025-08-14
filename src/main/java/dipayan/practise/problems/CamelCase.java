package dipayan.practise.problems;

public class CamelCase {
    public static void main(String[] args) {
        int result = camelcase("saveChangesInTheEditor");

        System.out.println("result is " + result);
    }

    public static int camelcase(String s) {
        char[] chars = s.toCharArray();
        int count = 1;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                count++;
            }
        }

        return count;
    }
}
