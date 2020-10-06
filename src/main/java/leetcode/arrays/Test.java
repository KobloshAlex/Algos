package leetcode.arrays;

public class Test {
  public static void main(String[] args) {
    System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
  }

  public static int maxProfit(int[] prices) {

    int result = 0;

    for (int price : prices) {
      result *= price;
    }
    return result;
  }
}
