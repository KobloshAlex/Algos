package leetcode.arrays;

public class MaxConsecutiveNums {
  /*Given a binary array, find the maximum number of consecutive 1s in this array.

  Example 1:
  Input: [1,1,0,1,1,1]
  Output: 3
  Explanation: The first two digits or the last three digits are consecutive 1s.
      The maximum number of consecutive 1s is 3.
  Note:

  The input array will only contain 0 and 1.*/
  public static void main(String[] args) {
    //
    System.out.println(findMaxConsecutive(new int[] {1, 1, 0, 1, 1, 1}));
  }

  public static final int findMaxConsecutive(int[] nums) {
   int max = 0;
   int counter = 0;
    for (int i = 0; i < nums.length; i++) {
      if(nums[i] == 1) {
        counter ++;
        max = Math.max(max, counter);
      } else {
        counter = 0;
      }
    }
    return max;
  }
}
