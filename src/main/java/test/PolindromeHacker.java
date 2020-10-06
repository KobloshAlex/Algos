package test;

import java.util.Scanner;

public class PolindromeHacker {
  static boolean isPolindrome(String word) {

    int i = 0;
    int j = word.length() - 1;

    while (i < j) {
      if (word.charAt(i) != word.charAt(j)) {
        return false;
      }

      i++;
      j--;
    }
    return true;
  }

  public static void main(String[] args) throws Exception {

    Scanner input = new Scanner(System.in);
    if (isPolindrome(input.nextLine())) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
