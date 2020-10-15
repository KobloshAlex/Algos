package leetcode.arrays;

public class MinSizeSubArraySum {
  public static void main(String[] args) {
    //

    System.out.println(findMinSub(new int[] {2, 3, 1, 2, 4, 3}, 7));
  }

  public static final int findMinSub(int[] nums, int s) {
    int min = Integer.MAX_VALUE;

    int left = 0;
    int valSum = 0;

    for (int i = 0; i < nums.length; i++) {

      valSum = valSum + nums[i];
      while (valSum >= s) {
        min = Math.min(min, i + 1 - left);
        valSum = valSum - nums[left];
        left++;
      }
    }
    return (min != Integer.MAX_VALUE) ? min : 0;
  }
}
