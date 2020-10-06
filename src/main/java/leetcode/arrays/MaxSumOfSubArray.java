package leetcode.arrays;

public class MaxSumOfSubArray {
  public static void main(String[] args) {
    System.out.println(doCalc(new int[] {-2, 2, 5, -11, 6}));
  }

  // [-2, 2 , 5 -11, 6]
  private static int doCalc(int[] nums) {

    int maxSum = nums[0];
    int currentSum = maxSum;

    for (int i = 1; i < nums.length; i++) {
      currentSum = Math.max(nums[i] + currentSum, nums[i]);
      maxSum = Math.max(currentSum, maxSum);
    }
    return maxSum;
  }
}
