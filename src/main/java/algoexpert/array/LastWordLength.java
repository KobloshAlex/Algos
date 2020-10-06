package algoexpert.array;

import java.util.HashSet;
import java.util.Set;

public class LastWordLength {
  public static void main(String[] args) {

    System.out.println(doCalc(new int[] {1, 2, 2, 4}));
  }

  private static boolean doCalc(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i])) {
        return true;
      } else {
        set.add(nums[i]);
      }
    }
    return false;
  }
}
