package hackerrank.array;

import java.util.Scanner;

class ItemSeparator {

  private final String input;

  ItemSeparator(String input) {
    this.input = input;
  }

  public String getName() {
    final String[] split = input.split("\\$\\$##");
    return split[0];
  }

  public Double getPrice() {
    final String[] split = input.split("\\$\\$##");
    return Double.parseDouble(split[1]);
  }

  public Integer getQuantity() {
    final String[] split = input.split("\\$\\$##");
    return Integer.parseInt(split[2]);
  }
}

public class Solution {
  public static void main(String[] args) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    Scanner sc = new Scanner(System.in);
    String sub = sc.nextLine();
    ItemSeparator itemData = new ItemSeparator(sub);
    System.out.println("Item Name: " + itemData.getName());
    System.out.println("Item Price: " + itemData.getPrice());
    System.out.println("Item Quantity: " + itemData.getQuantity());
  }
}
