package hackerrank.array;

import java.util.Arrays;

public class PairsInArray {

  public static void main(String[] args) {

    System.out.println(pairsCount(new int[] {2, 4, 2, 1, 5, 2, 1, 4}));
  }

  public static int pairsCount(int[] array) {

    int counter = 0;

    Arrays.sort(array);
    System.out.println(Arrays.toString(array));

    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] == array[i + 1]) {
        i++;
        counter++;
      }
    }

    return counter;
  }
}
