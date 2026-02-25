package dipayan.practise.leetcodetop150;

import java.util.Arrays;

public class Candy {
  public static void main(String[] args) {
    System.out.println(candy(new int[] {1, 3, 2, 2, 1, 4, 3, 5, 2, 1, 2}));
  }

  public static int candy(int[] ratings) {
    int totalCandies = 0;
    int len = ratings.length;
    int[] candies = new int[ratings.length];
    Arrays.fill(candies, 1);

    /*
    First pass: why i is checked with i-1, because we want to process first and allocate candy to next
    based on processed value. While allocating more candy to i, i-1 is already processed
    If we do i and i+1 check and allocate candy (more or less) to i, i+1 is not yet processed and might change.
     */
    for (int i = 1; i < len; i++) {
      if (ratings[i] > ratings[i - 1]) {
        candies[i] = candies[i - 1] + 1;
      }
    }

    /*
    Second pass: here after the first pass, i+1 is processed and there is no chance of reprocessing it in the
    second pass, so safe to compute based on i and i+1
     */
    for (int i = len - 2; i >= 0; i--) {
      if (ratings[i] > ratings[i + 1]) {
        candies[i] = Math.max(candies[i], candies[i + 1] + 1);
      }
    }

    for (int candy : candies) {
      totalCandies += candy;
    }

    return totalCandies;
  }
}
