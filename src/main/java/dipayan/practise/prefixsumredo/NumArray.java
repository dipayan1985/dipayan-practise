package dipayan.practise.prefixsumredo;

class NumArray {
  int[] nums;
  int prefixSum = 0;

  public NumArray(int[] nums) {
    this.nums = nums;

    for (int num : nums) {
      prefixSum += num;
    }
  }

  public int sumRange(int left, int right) {
    int sum1 = 0;
    int sum2 = 0;

    for (int i = 0; i < left; i++) {
      sum1 += nums[i];
    }

    for (int i = right + 1; i < nums.length; i++) {
      sum2 += nums[i];
    }

    return prefixSum - sum1 - sum2;
  }

  public static void main(String[] args) {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    NumArray numArray = new NumArray(nums);

    System.out.println(numArray.sumRange(0, 2)); // expected 1
    System.out.println(numArray.sumRange(2, 5)); // expected -1
    System.out.println(numArray.sumRange(0, 5)); // expected -3
  }
}
