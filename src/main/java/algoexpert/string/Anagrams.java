package algoexpert.string;

import java.util.Arrays;

public class Anagrams {

  public static void main(String[] args) {
    System.out.println(isAnagram("anagramm", "marganaa"));
  }

  static boolean isAnagram(String a, String b) {

    if (a == null || b == null || a.length() > b.length()) {
      return false;
    }

    final char[] firstArray = a.toLowerCase().toCharArray();
    final char[] secondArray = b.toLowerCase().toCharArray();
    Arrays.sort(firstArray);
    Arrays.sort(secondArray);
    System.out.println(firstArray);
    System.out.println(secondArray);

    return Arrays.equals(firstArray, secondArray);
  }
}
