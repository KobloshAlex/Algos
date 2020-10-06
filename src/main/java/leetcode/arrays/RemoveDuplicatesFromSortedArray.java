package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(doCalc(new int[] {0, 0, 0, 1, 1, 1, 1, 2, 3, 4})));
    System.out.println(doCalc2(new int[] {1, 1, 2}));
    System.out.println(doCalc3(new int[] {0, 0, 0, 1, 1, 1, 1, 2, 3, 4}));
  }

  private static int[] doCalc(int[] array) {

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < array.length; i++) {
      map.put(array[i], array[i]);
    }
    int[] result = new int[map.entrySet().size()];
    for (int i = 0; i < result.length; i++) {
      result[i] = map.get(i);
    }
    return result;
  }

  private static int doCalc2(int[] nums) {
    int index = 1;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] != nums[i + 1]) {
        nums[index++] = nums[i + 1];
      }
    }
    return index;
  }

  private static int doCalc3(int[] nums) {

    int counter = 1;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] != nums[i + 1]) {
        counter++;
      }
    }
    return counter;
  }
}
