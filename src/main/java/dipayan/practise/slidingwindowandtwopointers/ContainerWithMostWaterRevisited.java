package dipayan.practise.slidingwindowandtwopointers;

public class ContainerWithMostWaterRevisited {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxHeight = 0;

        while (left < right) {
            maxHeight = Math.max(maxHeight, Math.min(height[left], height[right]) * (right - left));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxHeight;
    }
}
