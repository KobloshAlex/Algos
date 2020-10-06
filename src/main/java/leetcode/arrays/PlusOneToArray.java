package leetcode.arrays;

import java.util.Arrays;

public class PlusOneToArray {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(plusOne(new int[] {9, 9, 9})));
    System.out.println(Arrays.toString(plusOne(new int[] {1, 2, 4})));
    System.out.println(Arrays.toString(plusOne(new int[] {1, 2, 9})));
  }

  private static int[] plusOne(int[] digits) {

    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      } else {
        digits[i] = 0;
      }
    }

    int[] newArray = new int[digits.length + 1];
    newArray[0] = 1;
    return newArray;
  }
}
