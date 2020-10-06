package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.Math.abs;

public class DuplicatesInArray {

  public static void main(String[] args) {
    // System.out.println(isDuplicates(new int[]{1, 2, 3, 3}));
    // isDuplicates(new int[]{1, 2, 3, 3});
    isDuplicatesWithSet(new int[] {1, 2, 3, 3});
    System.out.println("__________________");
    System.out.println(isDuplicateBest(new int[] {1, 1, 4, 5, 2, 3, 3}));
    System.out.println(doCalc(new int[] {1, 1, 4, 5, 2, 3, 3}));
    System.out.println(doCalc1(new int[] {1, 1, 4, 5, 2, 3, 3}));
  }

  private static void isDuplicates(int[] array) {

    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {

        if (array[i] == array[j]) {
          System.out.println(array[i]);
          break;
        }
      }
    }
  }

  // time O(n) space O(n)
  private static void isDuplicatesWithSet(int[] array) {

    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < array.length; i++) {
      if (!set.add(array[i])) {
        System.out.println(i);
      }
    }
    System.out.println("done");
    System.out.println(set);
  }

  // time O(n) space O(1)
  // check the index | if index is positive: change to negative and continue | if index is negative:
  // DUPLICATES!
  private static List<Integer> isDuplicateBest(int[] array) {

    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      if (array[abs(array[i])] > 0) {
        array[abs(array[i])] = -array[abs(array[i])];
      } else {
        result.add(abs(array[i]));
      }
    }

    return result;
  }

  private static List<Integer> doCalc(int[] array) {

    List<Integer> integers = new ArrayList<>();
    Arrays.sort(array);
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] == array[i + 1]) {
        integers.add(array[i]);
      }
    }
    return integers;
  }

  private static List<Integer> doCalc1(int[] array) {

    Set<Integer> set = new HashSet<>();
    List<Integer> result = new ArrayList<>();
    for (int number : array) {
      if (set.contains(number)) {
        result.add(number);
      }
      set.add(number);
    }
    return result;
  }
}
