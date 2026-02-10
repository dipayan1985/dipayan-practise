package dipayan.practise.slidingwindowandtwopointers;

public class IndexOfFirstOccuranceInString {
  public static void main(String[] args) {
    System.out.println(strStr("abc", "c"));
  }

  public static int strStr(String haystack, String needle) {
    int hl = haystack.length();
    int nl = needle.length();
    int i = 0;
    int j = 0;

    if (nl > hl) {
      return -1;
    }

    if (hl - nl == 0) {
      for (int m = 0; m < hl; m++) {
        if (haystack.charAt(m) != needle.charAt(m)) {
          return -1;
        }
      }

      return 0;
    }

    while (i <= hl - nl) {
      int k = i;

      while (j < nl && haystack.charAt(k) == needle.charAt(j)) {
        k++;
        j++;
      }

      if (j == nl) {
        return i;
      } else {
        j = 0;
      }

      i++;
    }

    return -1;
  }
}
