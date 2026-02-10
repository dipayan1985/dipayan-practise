package dipayan.practise.slidingwindowandtwopointers;

public class TrappingRainWater {
  public static void main(String[] args) {
    System.out.println(trap(new int[] {4, 2, 0, 3, 2, 5}));
  }

  public static int trap(int[] height) {
    int water = 0;
    int left = 0;
    int right = height.length - 1;
    int leftMax = height[left];
    int rightMax = height[right];

    while (left < right) {
      if (leftMax <= rightMax) {
        leftMax = Math.max(leftMax, height[left]);
        water += leftMax - height[left];
        left++;
      } else {
        rightMax = Math.max(rightMax, height[right]);
        water += rightMax - height[right];
        right--;
      }
    }

    return water;
  }
}
