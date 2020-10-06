package problems;

public class FindSmallestAndLargestInArray {
  public static void main(String[] args) {

    int[] array = new int[] {4, 2, 6, 7};

    int smallest = Integer.MAX_VALUE;
    int biggest = Integer.MIN_VALUE;

    for (int value : array) {
      if (value < smallest) {
        smallest = value;
      } else if (value > biggest) {
        biggest = value;
      }
    }
    System.out.println(smallest + " | " + biggest);
  }
}
