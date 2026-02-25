package dipayan.practise.arrays;

public class LengthOfLastWord {
  public static void main(String[] args) {
    System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
  }

  public static int lengthOfLastWord(String s) {
    int wordLen = 0;
    boolean foundFirst = false;

    for (int i = s.length() - 1; i >= 0; i--) {
      char c = s.charAt(i);

      if (c != ' ') {
        foundFirst = true;
        wordLen++;
      } else {
        if (foundFirst) {
          break;
        }
      }
    }

    return wordLen;
  }
}
