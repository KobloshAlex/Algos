package leetcode.arrays;

public class BestTimeToBuyAndSellStock2 {

  public static void main(String[] args) {

    System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
  }

  public static int maxProfit(int[] prices) {

    if (prices.length == 0 || prices == null) {
      return 0;
    }

    int profit = 0;
    for (int i = 0; i < prices.length - 1; i++) {

      if (prices[i] < prices[i + 1]) {
        profit += prices[i + 1] - prices[i];
      }
    }

    return profit;
  }
}
