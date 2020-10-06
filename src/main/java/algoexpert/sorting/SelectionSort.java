package algoexpert.sorting;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(selectionSort(new int[] {3, 1, 2})));
    System.out.println(Arrays.toString(selectionSortRe(new int[] {3, 1, 2})));
  }

  public static int[] selectionSort(int[] array) {
    // Write your code here.
    // traverse unsorted array
    for (int i = 0; i < array.length - 1; i++) {
      // Find the minimum element in unsorted array
      int index = i;
      for (int j = i + 1; j < array.length; j++)
        if (array[j] < array[index]) {
          index = j;
        }
      int temp = array[index];
      array[index] = array[i];
      array[i] = temp;
    }
    return array;
  }

  public static int[] selectionSortRe(int[] array) {

    for (int i = 0; i < array.length - 1; i++) {

      int swapIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[swapIndex]) {
          swapIndex = j;
        }
      }
      int tmp = array[swapIndex];
      array[swapIndex] = array[i];
      array[i] = tmp;
    }

    return array;
  }
}
