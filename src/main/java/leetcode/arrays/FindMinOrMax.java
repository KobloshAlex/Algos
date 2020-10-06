package leetcode.arrays;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindMinOrMax {

  public static void main(String[] args) {
    int[] array = {
      1, 2, 5, 8, 4, 2,
    };

    Arrays.sort(array);

    System.out.println(array[array.length - 1]);

    int min = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > min) {
        min = array[i];
      }
    }
    System.out.println(min);

    System.out.println(Arrays.stream(array).max().orElse(Integer.MIN_VALUE));

    SortedSet<Integer> sortedSet =
        new TreeSet<>(Arrays.stream(array).boxed().collect(Collectors.toList()));
    System.out.println(sortedSet.last());
  }
}
