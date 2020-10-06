package algoexpert.array;

import java.util.Arrays;

public class BiggestTreeInArray {
  public static void main(String[] args) {
    System.out.println(
        Arrays.toString(findThreeLargestNumbers(new int[] {1, 33, 22, 1, -1, 21, 53})));
  }

  public static int[] findThreeLargestNumbers(int[] array) {
    // Write your code here.
    int[] threeLargest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

    for (int number : array) {

      if (number > threeLargest[2]) {
        for (int i = 0; i <= 2; i++) {
          if (i == 2) {
            threeLargest[i] = number;
          } else {
            threeLargest[i] = threeLargest[i + 1];
          }
        }
      } else if (number > threeLargest[1]) {
        shiftAndUpdate(threeLargest, number, 1);
      } else if (number > threeLargest[0]) {
        shiftAndUpdate(threeLargest, number, 0);
      }
    }

    return threeLargest;
  }

  private static void shiftAndUpdate(int[] threeLargest, int number, int idx) {
    for (int i = 0; i <= idx; i++) {
      if (i == idx) {
        threeLargest[i] = number;
      } else {
        threeLargest[i] = threeLargest[i + 1];
      }
    }
  }
}
