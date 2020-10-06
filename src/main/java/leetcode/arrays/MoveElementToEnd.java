package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 1, 2, 2, 4, 2, 2));

    System.out.println(moveElementToEnd(list, 2));
  }

  // [1, 3, 2, 3, 4, 2, 2, 2]
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    // Write your code here.

    int i = 0;
    int j = array.size() - 1;

    while (i < j) {
      while (array.get(j) == toMove && i < j) {
        j = j - 1;
      }

      if (array.get(i) == toMove) {
        int tmp = array.get(j);
        array.set(j, array.get(i));
        array.set(i, tmp);
      }
      i++;
    }

    return array;
  }
}
