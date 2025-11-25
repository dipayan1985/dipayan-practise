package dipayan.practise.leetcodetop100;

public class BinarySubarraysWithSum {
    public static void main(String[] args) {
        System.out.println(numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2));
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int sum = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum > goal) {
                sum -= nums[j];
                j++;
            }

            if (sum == goal) {
                count++;
            }
        }

        return count;
    }
}
