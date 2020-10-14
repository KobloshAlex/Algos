package leetcode.arrays;

import java.util.Arrays;

public class PivotOfArray {
  public static void main(String[] args) {
    //
    System.out.println(findPivot(new int[] {1, 7, 3, 6, 5, 6}));
  }

  public static final int findPivot(int[] nums) {

    //int sumArray = Arrays.stream(nums).sum();

    int sumArray = 0;
    for (int num : nums) {
      sumArray = sumArray + num;

    }

    int leftSum = 0;
    for (int i = 0; i < nums.length; i++) {
      if( i != 0) {
        leftSum = leftSum + nums[i - 1];
      }
      if(sumArray - leftSum - nums[i] == leftSum) {
        return i;
      }
    }
    return -1;
  }
}
