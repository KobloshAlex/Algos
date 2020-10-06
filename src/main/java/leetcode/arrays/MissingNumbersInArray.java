package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbersInArray {
  public static void main(String[] args) {
    System.out.println(missingNums(new int[] {1, 2, 3, 4, 1}));
    System.out.println(doCalc(new int[] {1, 2, 3, 4, 1}));
  }

  // T: O(n) S: O(n)  dirty look
  private static List<Integer> missingNums(int[] nums) {
    List<Integer> result = new ArrayList<>();
    Set<Integer> set = new HashSet<>();

    for (int number : nums) {
      set.add(number);
    }

    for (int i = 1; i <= nums.length; i++) {
      if (!set.contains(i)) {
        result.add(i);
      }
    }

    return result;
  }
  // T: O(n) S: O(n)  Java8
  private static List<Integer> missingNumsClean(int[] nums) {
    List<Integer> result;

    Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

    result =
        IntStream.rangeClosed(1, nums.length)
            .filter(i -> !set.contains(i))
            .boxed()
            .collect(Collectors.toList());

    return result;
  }

  // T: O(n) S: O(1)

  private static List<Integer> doCalc(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      final int curr = Math.abs(nums[i]);
      nums[curr - 1] = -(Math.abs(nums[curr - 1]));
    }
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        result.add(Math.abs(i + 1));
      }
    }
    return result;
  }
}
