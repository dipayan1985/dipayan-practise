package dipayan.practise.slidingwindowandtwopointers;

import java.util.Arrays;

public class ThreeSumClosest {
  public static void main(String[] args) {
    System.out.println(threeSumClosest(new int[] {-1, 2, 1, -4}, 1)); // Output: 2
    // System.out.println(threeSumClosest(new int[]{0, 0, 0}, 1));
  }

  public static int threeSumClosest(int[] nums, int target) {
    int floor = Integer.MAX_VALUE;
    int ceil = Integer.MAX_VALUE;
    int ceilSum = Integer.MAX_VALUE;
    int floorSum = Integer.MAX_VALUE;
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      int third = nums[i];
      int j = i + 1;
      int k = nums.length - 1;

      while (j < k) {
        int sum = third + nums[j] + nums[k];

        if (sum == target) {
          return sum;
        }

        if (sum > target) {
          int currentCeil = Math.abs(sum - target);

          if (currentCeil < ceil) {
            ceil = currentCeil;
            ceilSum = sum;
          }

          k--;
        } else {
          int currentFloor = Math.abs(target - sum);

          if (currentFloor < floor) {
            floor = currentFloor;
            floorSum = sum;
          }

          j++;
        }
      }
    }

    return floor > ceil ? ceilSum : floorSum;
  }
}
