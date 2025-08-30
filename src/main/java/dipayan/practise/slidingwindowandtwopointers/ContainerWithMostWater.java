package dipayan.practise.slidingwindowandtwopointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 2, 1}));
    }

    public static int maxArea(int[] height) {
        int maxHeight = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxHeight = Math.max(maxHeight, Math.min(height[left], height[right]) * (right - left));

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }


        return maxHeight;
    }
}
