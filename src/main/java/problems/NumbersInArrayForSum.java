package problems;

import java.util.HashSet;
import java.util.Set;

public class NumbersInArrayForSum {

  public static void main(String[] args) {
    int[] array = new int[] {4, 2, 6, 7};
    int target = 9;

    findSum(array, target);

    findSumOn(array, target);
  }

  // O(n^2)
  public static void findSum(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if ((array[i] + array[j]) == target) {
          System.out.println(array[i] + " | " + array[j]);
        }
      }
    }
  }

  public static void findSumOn(int[] array, int n) {

    Set<Integer> set = new HashSet<>();

    for (int value : array) {
      int target = n - value;

      if (!set.contains(target)) {
        set.add(value);
      } else {
        System.out.println(value + " | " + target);
      }
    }
  }
}
