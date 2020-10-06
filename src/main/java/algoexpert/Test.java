package algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 6, 8, 2, 4));

    list.sort(Comparator.naturalOrder());
    System.out.println(list.get(list.size() - 1));

    int max = 0;
    for (Integer integer : list) {
      if (integer > max) {
        max = integer;
      }
    }
    System.out.println(max);
  }
}
