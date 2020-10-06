package algoexpert.sorting;

import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(insertionSort(new int[] {7, 1, 3, 44, 9, 2, -2})));
    System.out.println(Arrays.toString(insertionSortRe(new int[] {7, 1, 3, 44, 9, 2, -2})));
  }

  public static int[] insertionSort(int[] array) {
    // Write your code here.

    for (int i = 1; i < array.length; i++) {
      int key = array[i];
      int j = i - 1;

      while (j >= 0 && array[j] > key) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;

        j--;
      }
    }
    return array;
  }

  public static int[] insertionSortRe(int[] array) {

    for (int i = 1; i < array.length; i++) {
      int key = array[i];
      int j = i - 1;
      while (j >= 0 && array[j] > key) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;

        j--;
      }
    }
    return array;
  }
}
