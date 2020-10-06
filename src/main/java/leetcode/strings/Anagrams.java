package leetcode.strings;

import java.util.Arrays;

public class Anagrams {

  private static final int CHARACTER_RANGE = 256;

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

  public boolean isAnagramCounting(String string1, String string2) {
    if (string1.length() != string2.length()) {
      return false;
    }
    int[] count = new int[CHARACTER_RANGE];
    for (int i = 0; i < string1.length(); i++) {
      count[string1.charAt(i)]++;
      count[string2.charAt(i)]--;
    }
    for (int i = 0; i < CHARACTER_RANGE; i++) {
      if (count[i] != 0) {
        return false;
      }
    }
    return true;
  }
}
