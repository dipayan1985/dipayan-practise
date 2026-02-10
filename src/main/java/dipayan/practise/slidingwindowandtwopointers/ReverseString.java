package dipayan.practise.slidingwindowandtwopointers;

public class ReverseString {
  public static void main(String[] args) {
    char[] s = {'h', 'e', 'l', 'l', 'o'};

    int i = 0;
    int j = s.length - 1;

    while (i < j) {
      char temp = s[j];
      s[j] = s[i];
      s[i] = temp;
      i++;
      j--;
    }

    for (char c : s) {
      System.out.print(c + " ");
    }
  }
}
