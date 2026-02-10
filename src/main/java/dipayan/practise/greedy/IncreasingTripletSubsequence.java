package dipayan.practise.greedy;

public class IncreasingTripletSubsequence {
  public static void main(String[] args) {
    System.out.println(increasingTriplet(new int[] {20, 100, 10, 12, 5, 13}));
  }

  public static boolean increasingTriplet(int[] nums) {
    int first = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;
    int i = 0;

    while (i < nums.length) {
      int number = nums[i];

      if (number <= first) {
        first = number;
      } else if (number < second) {
        second = number;
      } else {
        return true;
      }

      i++;
    }

    return false;
  }
}
