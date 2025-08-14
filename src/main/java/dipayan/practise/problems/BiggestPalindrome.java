package dipayan.practise.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BiggestPalindrome {
    public static void main(String[] args) {
        System.out.println(highestValuePalindrome("1231", 3, 4));
    }

    public static String highestValuePalindrome(String string, int numSwaps, int stringLen) {
        int i = 0;
        int j = stringLen - 1;
        int swaps = 0;
        char[] chars = string.toCharArray();
        int[] positions = new int[numSwaps];
        int k = 0;

        // 1232 -> 2332
        while (i < j) {
            if (chars[i] != chars[j]) {
                if (swaps < numSwaps) {
                    if (chars[i] > chars[j]) {
                        chars[j] = chars[i];
                        positions[k++] = j;
                    } else {
                        chars[i] = chars[j];
                        positions[k++] = i;
                    }

                    swaps++;
                } else {
                    System.out.println("Impossible");
                }
            }

            i++;
            j--;
        }

        // 1231 -> 1331 -> 9331

        int l = 0;
        int m = stringLen - 1;
        List<Integer> positionList = Arrays.stream(positions).boxed().toList();

        while (l <= m) {
            if (l == m) {
                if (numSwaps - swaps >= 1 && chars[l] != '9') {
                    chars[l] = '9';
                    swaps++;
                }
            } else {
                if (numSwaps - swaps > 1) {
                    if (positionList.contains(l) || positionList.contains(m)) {
                        chars[l] = '9';
                        chars[m] = '9';
                        swaps += 1;
                    } else {
                        chars[l] = '9';
                        chars[m] = '9';
                        swaps += 2;
                    }
                }
            }

            l++;
            m--;
        }

        return String.valueOf(chars);
    }
}
