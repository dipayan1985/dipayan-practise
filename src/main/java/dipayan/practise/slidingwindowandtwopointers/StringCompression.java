package dipayan.practise.slidingwindowandtwopointers;

public class StringCompression {
  public static void main(String[] args) {
    char[] chars = {'b', 'b', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};

    System.out.println(compress(chars));
  }

  public static int compress(char[] chars) {
    // bbabb
    int i = 0;
    int j = 0;
    int len = chars.length;
    int count = 0;
    int index = 0;

    while (i < len && j < len) {
      if (chars[i] == chars[j]) {
        j++;
        count++;
      } else {
        chars[index++] = chars[i];

        if (count > 1) {
          for (char c : String.valueOf(count).toCharArray()) {
            chars[index++] = c;
          }
        }

        count = 0;
        i = j;
      }
    }

    chars[index++] = chars[i];

    if (count > 1) {
      for (char c : String.valueOf(count).toCharArray()) {
        chars[index++] = c;
      }
    }

    return index;
  }
}
