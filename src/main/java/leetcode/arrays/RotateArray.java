package leetcode.arrays;

import java.util.Arrays;

public class RotateArray {

  public static void main(String[] args) {
    int[] arrau = new int[] {1, 2, 3, 4, 5, 6};
    rotate(arrau, 4);
    System.out.println(Arrays.toString(arrau));
  }

  public static void rotate(int[] nums, int k) {
    // need to know how many numbers to reverse(optional)
    k = k % nums.length;
    // reverse all array
    reverse(nums, 0, nums.length - 1);
    // After reversing first k numbers
    reverse(nums, 0, k - 1);
    // After revering last n-k numbers
    reverse(nums, k, nums.length - 1);
  }

  private static void reverse(int[] nums, int i, int j) {
    while (i < j) {
      int tmp = nums[i];
      nums[i] = nums[j];
      nums[j] = tmp;
      i++;
      j--;
    }
  }
}
