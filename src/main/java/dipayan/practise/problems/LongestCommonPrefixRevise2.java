package dipayan.practise.problems;

public class LongestCommonPrefixRevise2 {
  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
  }

  public static String longestCommonPrefix(String[] strs) {
    StringBuilder longestPrefix = new StringBuilder();

    char[] charArray = strs[0].toCharArray();

    for (int j = 0; j < charArray.length; j++) {
      char c = charArray[j];
      boolean matched = true;

      for (int i = 1; i < strs.length; i++) {
        String s1 = strs[i];

        if (j < s1.length() && s1.charAt(j) != c) {
          matched = false;
          break;
        }
      }

      if (matched) {
        longestPrefix.append(c);
      } else {
        break;
      }
    }

    return longestPrefix.toString();
  }
}
