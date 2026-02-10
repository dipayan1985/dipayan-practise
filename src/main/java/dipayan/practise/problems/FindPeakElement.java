package dipayan.practise.problems;

public class FindPeakElement {
    public static void main(String[] args) {

    }

    public int findPeakElement(int[] nums) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
