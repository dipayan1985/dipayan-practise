package dipayan.practise.greedy;

public class CanPlaceFlowers {
  public static void main(String[] args) {}

  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    if (n == 0) {
      return true;
    }

    int length = flowerbed.length;

    if (length == 1 && flowerbed[0] == 0 && n == 1) {
      return true;
    }

    if (flowerbed[0] == 0 && flowerbed[1] == 0) {
      flowerbed[0] = 1;
      n--;
    }

    if (flowerbed[length - 1] == 0 && flowerbed[length - 2] == 0 && n > 0) {
      flowerbed[length - 1] = 1;
      n--;
    }

    for (int i = 1; i < flowerbed.length - 1; i++) {
      int elem = flowerbed[i];

      if (elem == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && n > 0) {
        flowerbed[i] = 1;
        n--;
      }
    }

    return n == 0;
  }
}
