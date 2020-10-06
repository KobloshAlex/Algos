package problems;

import java.util.Arrays;

public class StringOccurrences {

  public static void main(String[] args) {

    String string = "Hello";
    printOccurrencesNot(string);
  }

  // O(n^2)
  private static void printOccurrencesNot(String string) {
    final char[] chars = string.toLowerCase().toCharArray();
    for (int i = 0; i < chars.length; i++) {
      for (int j = i + 1; j < chars.length; j++) {
        if (chars[i] == chars[j]) {
          System.out.println(chars[i]);
        }
      }
    }
  }

  // O(n)
  private static void printOccurrences(String string) {
    final char[] chars = string.toCharArray();
    Arrays.sort(chars);
    for (int i = 0; i < chars.length - 1; i++) {
      if (chars[i] == chars[i + 1]) {
        System.out.println(chars[i]);
      }
    }
  }
}
