package leetcode.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
  public static void main(String[] args) {
    //
    System.out.println(missingNumber(new int[] {3, 0, 1}));
    System.out.println(missingNumber1(new int[] {3, 0, 1}));
  }

  // O(n) time O(n) space
  public static int missingNumber(int[] nums) {

    Set<Integer> set = new HashSet<>();

    for (int num : nums) {
      set.add(num);
    }

    for (int i = 0; i < set.size(); i++) {
      if (!set.contains(i)) {
        return i;
      }
    }
    return -1;
  }

  public static int missingNumber1(int[] nums) {

    if (nums == null || nums.length == 0) {
      return 0;
    }
    Arrays.sort(nums);

    // Ensure that n is at the last index
    if (nums[nums.length-1] != nums.length) {
      return nums.length;
    }
    // Ensure that 0 is at the first index
    else if (nums[0] != 0) {
      return 0;
    }
    for (int i = 1; i < nums.length; i++) {
      int numPlusOne = nums[i - 1] + 1;
      if (nums[i] != numPlusOne) {
        return numPlusOne;
      }
    }
    return -1;
  }
}
