package dipayan.practise.greedy;

public class JumpGame2 {
  public static void main(String[] args) {
    int[] nums = {2, 3, 1, 1, 4};

    int numJumps = numJumps(nums);

    System.out.println("Number of jumps: " + numJumps);
  }

  private static int numJumps(int[] nums) {
    int numJumps = 0;
    int i = 0;
    int maxReach = 0;
    int end = 0;

    while (i < nums.length - 1) {
      maxReach = Math.max(maxReach, i + nums[i]);

      if (i == end) {
        numJumps++;
        end = maxReach;
      }

      i++;
    }

    return numJumps;
  }
}
