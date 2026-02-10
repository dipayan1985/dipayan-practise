package dipayan.practise.leetcodetop100;

public class TrappingRainWater {
  public static void main(String[] args) {
    // 4,2,0,3,2,5
    System.out.println(trap(new int[] {4, 2, 0, 3, 2, 5}));
  }

  public static int trap(int[] height) {
    int total = 0;
    int right = height.length - 1;
    int left = 0;
    int leftMax = Integer.MIN_VALUE;
    int rightMax = Integer.MIN_VALUE;

    while (left <= right) {
      if (leftMax <= rightMax) {
        if (height[left] < leftMax) {
          total = total + (leftMax - height[left]);
        } else {
          leftMax = height[left];
        }

        left++;
      } else {
        if (height[right] < rightMax) {
          total = total + (rightMax - height[right]);
        } else {
          rightMax = height[right];
        }

        right--;
      }
    }

    return total;
  }
}
