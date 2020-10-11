package leetcode.arrays;

import java.io.Serializable;

public class HouseRobber {
  public static void main(String[] args) {
    System.out.println(houseRobber(new int[] {2, 7, 9, 3, 1}));
  }

  public static final int houseRobber(int[] nums) {

    if (nums == null || nums.length == 0) {
      return 0;
    }

    int sumEven = 0;
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i % 2 == 0) {
        sumEven = sumEven + nums[i];
      }
      sum = sum + nums[i];
    }
    return Math.max(sumEven, sum - sumEven);
  }

  public static int rob(int[] nums) {
    int ifRobbedPrevious = 0; // max monney can get if rob current house
    int ifDidntRobPrevious = 0; // max money can get if not rob current house

    // We go through all the values, we maintain two counts, 1) if we rob this cell, 2) if we didn't
    // rob this cell
    for (int i = 0; i < nums.length; i++) {
      // If we rob current cell, previous cell shouldn't be robbed. So, add the current value to
      // previous one.
      int currRobbed = ifDidntRobPrevious + nums[i];

      // If we don't rob current cell, then the count should be max of the previous cell robbed and
      // not robbed
      int currNotRobbed = Math.max(ifDidntRobPrevious, ifRobbedPrevious);

      // Update values for the next round
      ifDidntRobPrevious = currNotRobbed;
      ifRobbedPrevious = currRobbed;
    }

    return Math.max(ifRobbedPrevious, ifDidntRobPrevious);
  }
}
