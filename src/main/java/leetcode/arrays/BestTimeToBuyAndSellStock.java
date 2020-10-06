package leetcode.arrays;

public class BestTimeToBuyAndSellStock {
  public static void main(String[] args) {

    System.out.println(doCalc(new int[] {7, 1, 5, 3, 6, 4}));
  }

  private static int doCalc(int[] ints) {

    if (ints.length == 0) {
      return 0;
    }

    int minStockPrice = Integer.MAX_VALUE;
    int bestProfit = 0;

    for (int i = 0; i < ints.length; i++) {
      if (minStockPrice > ints[i]) {
        minStockPrice = ints[i];
      } else if (ints[i] - minStockPrice > bestProfit) {
        bestProfit = ints[i] - minStockPrice;
      }
    }

    return bestProfit;
  }
}
