package algoexpert.array;

public class FindSmallestAndBiggestDifferenceInArray {

  public static void main(String[] args) {
    System.out.println(find(new int[] {1, 3, 6, 17, 4}));
  }

  // 5 - 3 > -1 { max = }
  public static int find(int[] array) {

    int maxDif = -1; // 4
    int value = array[0];
    // array[i] 7 - [value] 3
    for (int i = 1; i < array.length; i++) {
      if (array[i] - value > maxDif) {
        maxDif = array[i] - value;
      } else {
        value = array[i];
      }
    }
    return maxDif;
  }
}
