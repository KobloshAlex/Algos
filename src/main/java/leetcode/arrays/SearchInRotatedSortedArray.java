package leetcode.arrays;

public class SearchInRotatedSortedArray {

  public static void main(String[] args) {

    System.out.println(search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
  }

  public static int search(int[] nums, int target) {
    if (nums.length == 0 || nums == null) {
      return 0;
    }

    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] > nums[right]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    int start = left;
    left = 0;
    right = nums.length - 1;

    if (target >= nums[start] && target <= nums[right]) {
      left = start;
    } else {
      right = start;
    }

    while (left <= right) {
      int midpoint = left + (right - left) / 2;
      if (nums[midpoint] == target) {
        return midpoint;
      } else if (nums[midpoint] < target) {
        left = midpoint + 1;
      } else {
        right = midpoint - 1;
      }
    }
    return -1;
  }
}
