package dipayan.practise.problems.greedy;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {0};

        boolean canReach = canJump(nums);

        System.out.println("Can reach end: " + canReach);
    }

    private static boolean canJump(int[] nums) {
        int i = 0;
        int maxReach = 0;

        while (i < nums.length) {
            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);

            if (maxReach >= nums.length - 1) {
                return true;
            }

            i++;
        }

        return true;
    }
}

