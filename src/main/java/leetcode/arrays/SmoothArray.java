package leetcode.arrays;

public class SmoothArray {
  public static void main(String[] args) {
    //
    System.out.println(isSmooth(new int[]  {5, 4, 3, 4, 5}));
  }

  public static final boolean isSmooth(int[] nums) {

    int difference = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      difference = nums[i] - nums[i + 1];
    }

    return Math.abs(difference) == 1 || Math.abs(difference) == 0;
  }
}
