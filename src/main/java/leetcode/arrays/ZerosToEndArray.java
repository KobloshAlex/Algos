package leetcode.arrays;

import java.util.Arrays;

public class ZerosToEndArray {
  public static void main(String[] args) {
    System.out.println(
        Arrays.toString(sortZeros(new int[] {0, 1, 0, 3, 12}))); // [1, 3, 12, 0, 0 <current> ...]
    System.out.println(
        Arrays.toString(doZeros(new int[] {0, 1, 0, 3, 12}))); // [1, 3, 12, 0, 0 <current> ...]
  }

  private static int[] sortZeros(int[] array) {

    int current = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] != 0) {
        array[current] = array[i];
        current++;
      }
    }
    for (int i = current; i < array.length; i++) {
      array[i] = 0;
    }
    return array;
  }

  // [0, 1, 0, 3, 12] [1, 3, 12, 0, 0 <current> ...]

  private static int[] doZeros(int[] array) {

    int current = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] != 0) {
        array[current] = array[i];
        current++;
      }
    }
    for (int i = current; i < array.length; i++) {
      array[i] = 0;
    }

    return array;
  }
}
