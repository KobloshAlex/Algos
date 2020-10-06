package algoexpert.sorting;

import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(quickSort(new int[] {5, 2, 3, 1})));
  }

  public static int[] quickSort(int[] array) {
    quickSort(array, 0, array.length - 1);
    // Write your code here.
    return array;
  }

  private static void quickSort(int[] array, int startIdx, int endIdx) {

    if (startIdx >= endIdx) {
      return;
    }

    int pivotIdx = startIdx;
    int leftIdx = startIdx + 1;
    int rightIdx = endIdx;

    while (rightIdx >= leftIdx) {
      if (array[leftIdx] > array[pivotIdx] && array[rightIdx] < array[pivotIdx]) {
        swap(leftIdx, rightIdx, array);
      }
      if (array[leftIdx] <= array[pivotIdx]) {
        leftIdx += 1;
      }
      if (array[rightIdx] >= array[pivotIdx]) {
        rightIdx -= 1;
      }
    }
    swap(pivotIdx, rightIdx, array);

    boolean leftSubArrayIsSmaller = rightIdx - 1 - startIdx < endIdx - (rightIdx + 1);
    if (leftSubArrayIsSmaller) {
      quickSort(array, startIdx, rightIdx - 1);
      quickSort(array, rightIdx + 1, endIdx);
    } else {
      quickSort(array, rightIdx + 1, endIdx);
      quickSort(array, startIdx, rightIdx - 1);
    }
  }

  private static void swap(int i, int j, int[] array) {
    int tmp = array[j];
    array[j] = array[i];
    array[i] = tmp;
  }
}
