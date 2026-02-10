package dipayan.practise.general;

public class IsSubsequence {
  public static void main(String[] args) {
    System.out.println(isSubsequence("abc", "ahbgdc"));
  }

  public static boolean isSubsequence(String s, String t) {
    int i = 0;
    int j = 0;

    while (j < t.length() && i < s.length()) {
      if (t.charAt(j) == s.charAt(i)) {
        i++;
      }

      j++;
    }

    return i == s.length();
  }
}
