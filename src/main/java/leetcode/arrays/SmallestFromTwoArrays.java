package leetcode.arrays;

import java.util.Arrays;

public class SmallestFromTwoArrays {

  public static void main(String[] args) {
    System.out.println(
        Arrays.toString(smallestDifference(new int[] {22, 11, 122, 3}, new int[] {21, 43, 8, 6})));
  }

  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    // Write your code here.

    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);
    int indexOne = 0;
    int indexTwo = 0;
    int smallest = Integer.MAX_VALUE;
    int current = Integer.MAX_VALUE;
    int[] smallestPair = new int[2];

    while (indexOne < arrayOne.length && indexTwo < arrayTwo.length) {
      int firstSum = arrayOne[indexOne];
      int secondSum = arrayTwo[indexTwo];

      if (firstSum < secondSum) {
        current = secondSum - firstSum;
        indexOne++;
      } else if (secondSum < firstSum) {
        current = firstSum - secondSum;
        indexTwo++;
      } else {
        return new int[] {firstSum, secondSum};
      }
      if (smallest > current) {
        smallest = current;
        smallestPair = new int[] {firstSum, secondSum};
      }
    }
    return smallestPair;
  }
}
