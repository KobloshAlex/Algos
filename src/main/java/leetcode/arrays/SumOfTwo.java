package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SumOfTwo {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10)));
    System.out.println(Arrays.toString(doCalc(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10)));
  }

  public static int[] twoNumberSum(int[] array, int targetSum) {
    HashSet<Integer> numbers = new HashSet<>();
    for (int currentNumber : array) {
      final int potentialNumber = targetSum - currentNumber;
      if (numbers.contains(potentialNumber)) {
        return new int[] {potentialNumber, currentNumber};
      } else {
        numbers.add(currentNumber);
      }
    }
    return new int[0];
  }

  private static int[] doCalc(int[] nums, int target) {

    if (nums.length == 0) return new int[0];

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int potentialNumber = target - nums[i];
      if (map.containsKey(potentialNumber)) {
        return new int[] {map.get(potentialNumber), i};
      } else {
        map.put(nums[i], i);
      }
    }
    return new int[0];
  }
}
