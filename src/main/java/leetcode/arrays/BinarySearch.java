package leetcode.arrays;

public class BinarySearch {
  public static void main(String[] args) {
    System.out.println(findBinary(new int[] {1, 2, 4, 6, 7, 9}, 2));
    System.out.println(doBinary(new int[] {1, 2, 4, 6, 7, 9}, 2));
  }

  private static int findBinary(int[] nums, int target) {

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      if (target < nums[mid]) {
        right = mid - 1;
      } else if (target > nums[mid]) {
        left = mid + 1;
      } else {
        return mid;
      }
    }

    return -1;
  }

  // left   target(2)    right
  // [1, 2, 4, 6, 7, 9];

  public static int doBinary(int[] nums, int target) {

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {

      int mid = left + (right - left) / 2;

      if (target == nums[mid]) {
        return mid;
      } else if (target < nums[mid]) {
        right = mid - 1;
      } else left = mid + 1;
    }

    return -1;
  }
}
