package dipayan.practise.slidingwindowandtwopointers;

public class MaximumValueOfOrderedTriplet2 {
    public static void main(String[] args) {
        System.out.println(maximumTripletValue(new int[]{1, 10, 3, 4, 19}));
    }

    public static long maximumTripletValue(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }

        long maxValue = Integer.MIN_VALUE;
        int left = 0;
        int maxDiff = Integer.MIN_VALUE;
        int left2 = 1;

        while (left2 <= nums.length - 2) {
            int diff = 0;

            if (nums[left] > nums[left2]) {
                diff = nums[left] - nums[left2];
            } else {
                left = left2;
            }

            left2++;
            maxDiff = Math.max(diff, maxDiff);

            if (diff > 0) {
                int maxMultiplier = nums[nums.length - 1];

                for (int i = left2; i < nums.length; i++) {
                    maxMultiplier = Math.max(maxMultiplier, nums[i]);
                }

                maxValue = Math.max(maxValue, (long) maxMultiplier * maxDiff);
            }
        }

        return maxValue == Integer.MIN_VALUE ? 0 : maxValue;
    }
}
