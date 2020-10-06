package leetcode.arrays;

public class AvarageSalaryExcludMinMax {
  public static void main(String[] args) {
    System.out.println(doCalc(new int[] {1, 3, 2, 9}));
  }

  private static int doCalc(int[] array) {

    int maxSalary = Integer.MIN_VALUE;
    int minValue = Integer.MAX_VALUE;
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < minValue) {
        minValue = array[i];
      } else if (array[i] > maxSalary) {
        maxSalary = array[i];
      }
      sum = sum + array[i];
    }

    return sum - (maxSalary + minValue);
  }
}
