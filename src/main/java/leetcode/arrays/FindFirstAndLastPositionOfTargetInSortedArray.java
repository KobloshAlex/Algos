package leetcode.arrays;

import java.util.Arrays;

public class FindFirstAndLastPositionOfTargetInSortedArray {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8)));
  }

  public static final int[] searchRange(int[] nums, int target) {
    int[] result = new int[2];

    result[0] = findlLeftMostIndex(nums, target);
    result[1] = fidnRightMostIndex(nums, target);

    return result;
  }

  // s    t(2)    e
  // [1,2 ,3, 4, 6,];
  private static int findlLeftMostIndex(int[] nums, int target) {
    int index = -1;

    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (nums[mid] >= target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
      if (nums[mid] == target) {
        index = mid;
      }
    }
    return index;
  }

  private static int fidnRightMostIndex(int[] nums, int target) {
    int index = -1;

    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] <= target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
      if (nums[mid] == target) {
        index = mid;
      }
    }
    return index;
  }
}
