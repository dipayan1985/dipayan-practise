package dipayan.practise.leetcodetop150;

public class RemoveDuplicatesFromSortedArray {
  public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[] {1, 1, 2, 3}));
  }

  public static int removeDuplicates(int[] nums) {
    int index = 1;

    /*
    We start from 0 in the for-loop. We need to compare pairs 0..1, 1..2, 2..3, etc.
    If we had started from 1, then we would have compared 1..2, 2..3 and so on
    We started index = 1 so 0 is written, if 1 and 2 are unique, then we would end up writing 2
    and ignore 1 forever.
     */

    /*
    Always base your decision on what you've already written,
    not only on what you're currently reading.
     */

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] != nums[i + 1]) {
        nums[index++] = nums[i + 1];
      }
    }

    return index;
  }
}
