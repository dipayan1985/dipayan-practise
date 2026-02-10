package dipayan.practise.general;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LeftArrayRotation {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(leftRotateOptimal(new int[] {1, 2, 3, 4, 5}, 4)));
  }

  public static int[] leftRotate(int[] arr, int numRotation) {
    for (int i = 0; i < numRotation; i++) {
      int index = 0;
      int temp = arr[0];

      for (int j = 1; j < arr.length; j++) {
        arr[index++] = arr[j];
      }

      arr[arr.length - 1] = temp;
    }

    return arr;
  }

  public static int[] leftRotateOptimal(int[] arr, int numRotation) {
    List<Integer> list = Arrays.stream(arr).boxed().toList();

    return Stream.concat(
            list.subList(numRotation, list.size()).stream(), list.subList(0, numRotation).stream())
        .mapToInt(c -> c)
        .toArray();
  }

  public static int[] leftRotateHighOptimal(int[] arr, int numRotation) {
    return arr;
  }
}
