package dipayan.practise.leetcodetop100;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        return IntStream.rangeClosed(0, n).sum() - Arrays.stream(nums).sum();
    }
}
