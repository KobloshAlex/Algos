package algoexpert.sorting;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(bubbleSort(new int[] {7, 1, 3, 44, 9, 2, -2})));
    System.out.println(Arrays.toString(bubbleSortRe(new int[] {4, 2, 8, 1})));
  }

  public static int[] bubbleSort(int[] array) {

    boolean isSorted = false;
    int counter = 0;

    while (!isSorted) {
      isSorted = true;

      for (int i = 0; i < array.length - 1 - counter; i++) {
        if (array[i] > array[i + 1]) {
          isSorted = false;

          int temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
        }
      }
      counter++;
    }

    return array;
  }

  //    public static List<Integer> sort(List<Integer> items) {
  //
  //        HashMap<Integer, Integer> hashMap = new HashMap<>();
  //        for(Integer integer : items) {
  //            if(!hashMap.containsKey(integer)) {
  //                hashMap.put(integer, 1);
  //            } else {
  //                hashMap.put(integer, hashMap.get(integer)+1);
  //            }
  //        }
  //
  //        List<Integer> list = new ArrayList<>();
  //        hashMap.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue()
  //                .thenComparing(Map.Entry.comparingByKey()))
  //           .forEach(e -> {
  //               for(int i=0; i<e.getValue(); i++) {
  //                   list.add(e.getKey());
  //               }
  //           });
  //
  //        return list;
  //    }
  //
  //
  // [1, 2, 3, 5] isSwap? : Yes = repeat | No = Done
  public static int[] bubbleSortRe(int[] array) {

    boolean isSwap = true;

    while (isSwap) {
      isSwap = false;

      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          int temp = array[i + 1];
          array[i + 1] = array[i];
          array[i] = temp;

          isSwap = true;
        }
      }
    }

    return array;
  }
}
