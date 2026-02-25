package dipayan.practise.leetcodetop150;

public class RemoveDuplicatesFromSortedArray2 {
  public static void main(String[] args) {
    System.out.println(removeDuplicatesInverse(new int[] {1, 2, 3}));
  }

  public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;

    int index = 1;
    int count = 1;

    /*
    Remember: The cases where we write, we only write when there are unique elements, or
    we write when the count is < 2

    We start from 0 in the for-loop. We need to compare pairs 0..1, 1..2, 2..3, etc.
    If we had started from 1, then we would have compared 1..2, 2..3 and so on
    We started index = 1 so 0 is written, if 1 and 2 are unique, then we would end up writing 2
    and ignore 1 forever.

    Example: 1,2,3 will end up 1,3,3
     */

    /*
    Always base your decision on what you've already written,
    not only on what you're currently reading.
     */

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] != nums[i + 1]) {
        nums[index++] = nums[i + 1];
        count = 1;
      } else {
        if (count < 2) {
          nums[index++] = nums[i + 1];
          count++;
        }
      }
    }

    return index;
  }

  public static int removeDuplicatesInverse(int[] nums) {
    if (nums.length == 0) return 0;

    int index = 1;
    int count = 1;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        if (count < 2) {
          nums[index++] = nums[i + 1];
          count++;
        }
      } else {
        count = 1;
        nums[index++] = nums[i + 1];
      }
    }

    return index;
  }
}
