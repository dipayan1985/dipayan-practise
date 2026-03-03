package dipayan.practise.leetcodetop150;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrowsToBurstBalloons {
  public static void main(String[] args) {
    int[][] points = {
      {10, 16},
      {2, 8},
      {1, 6},
      {7, 12} // 1,6..2,8..7,12..10,16
    };

    int result = findMinArrowShots(points);

    System.out.println("Minimum arrows needed: " + result);
  }

  public static int findMinArrowShots(int[][] points) {
    if (points.length == 0) return 0;

    int numberOfBalloons = 0;
    Arrays.sort(points, Comparator.comparingInt(p -> p[1]));

    int[] firstPoint = points[0];
    int hit = firstPoint[1];
    numberOfBalloons++;

    for (int i = 1; i < points.length; i++) {
      int[] nextPoint = points[i];
      int nextStart = nextPoint[0];

      if (nextStart > hit) {
        numberOfBalloons++;
        hit = nextPoint[1];
      }
    }

    return numberOfBalloons;
  }
}
