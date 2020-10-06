package leetcode.arrays;

import java.util.Arrays;

public class SumOfTwoInSortedArray {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoSum(new int[] {1, 2, 5, 7, 10}, 7)));
  }

  public static int[] twoSum(int[] numbers, int target) {
    int i = 0;
    int j = numbers.length - 1;

    while (i <= j) {
      if (numbers[i] + numbers[j] > target) {
        j--;
      } else if (numbers[i] + numbers[j] < target) {
        i++;
      } else {
        return new int[] {i, j};
      }
    }
    return new int[] {i, j};
  }
}
