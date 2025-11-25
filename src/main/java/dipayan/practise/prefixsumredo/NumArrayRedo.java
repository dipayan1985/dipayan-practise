package dipayan.practise.prefixsumredo;

class NumArrayRedo {
    int[] nums;
    int[] prefixSums;

    public NumArrayRedo(int[] nums) {
        this.nums = nums;
        this.prefixSums = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefixSums[i] = sum;
        }
    }

    public int sumRange(int left, int right) {
        if (left > 0) {
            return prefixSums[right] - prefixSums[left - 1];
        } else {
            return prefixSums[right];
        }
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArrayRedo numArray = new NumArrayRedo(nums);

        System.out.println(numArray.sumRange(0, 2)); // expected 1
        System.out.println(numArray.sumRange(2, 5)); // expected -1
        System.out.println(numArray.sumRange(0, 5)); // expected -3
    }
}

