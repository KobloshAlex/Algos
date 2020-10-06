package algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfProducts {

  public static void main(String[] args) {

    List<Object> list =
        new ArrayList<>(
            Arrays.asList(
                5,
                2,
                new ArrayList<Object>(Arrays.asList(7, -1)),
                3,
                new ArrayList<Object>(
                    Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));

    System.out.println(productSum(list));
  }

  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    // Write your code here.
    return sumHelper(array, 1);
  }

  public static int sumHelper(List<Object> list, int multiplier) {

    int sum = 0;

    for (Object element : list) {

      if (element instanceof ArrayList) {
        ArrayList<Object> ls = (ArrayList<Object>) element;
        sum = sum + sumHelper(ls, multiplier + 1);
      } else {
        sum = sum + (int) element;
      }
    }
    return sum;
  }
}
