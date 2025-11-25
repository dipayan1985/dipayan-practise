package dipayan.practise.prefixSum;

public class ContiguousArray {
    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{0, 1, 1, 1, 1, 1, 0, 0, 0}));
    }

    public static int findMaxLength(int[] nums) {
        int prefixSum = 0;
        int len = 0;
        int maxLen = 0;
        int consecutiveTemps = 0;

        for (int num : nums) {
            int temp = num;

            if (temp == 0) {
                temp = -1;
                consecutiveTemps++;
            } else {
                consecutiveTemps = 0;
            }

            prefixSum = prefixSum + temp;

            if (prefixSum == 0) {
                maxLen = Math.max(consecutiveTemps * 2, maxLen);
            }
        }

        return maxLen;
    }
}
