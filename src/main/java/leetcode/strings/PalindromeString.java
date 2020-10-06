package leetcode.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeString {

  public static void main(String[] args) {
    System.out.println(isPalindrome("abba"));
    System.out.println(isPalindromeList("abba"));
    System.out.println(isPalindromeStringBuilder("abba"));
    System.out.println(isPalindromeLambda("abba"));
    System.out.println(isPalindromeBest("abba"));
    System.out.println(isPalindromeString("abba"));
    System.out.println(isPalindromeRecursion("abba"));
  }

  public static boolean isPalindrome(String str) {
    // Write your code here.
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      final char letter = str.charAt(i);
      stringBuilder.append(letter);
    }
    final String word = stringBuilder.toString();

    return word.equals(str);
  }

  public static boolean isPalindromeList(String str) {
    List<Character> chars = new ArrayList<>();

    for (int i = str.length() - 1; i >= 0; i--) {
      chars.add(str.charAt(i));
    }
    final String collect = chars.stream().map(String::valueOf).collect(Collectors.joining());
    return collect.equals(str);
  }

  public static boolean isPalindromeStringBuilder(String str) {
    return str.equals(new StringBuilder().append(str).reverse().toString());
  }

  public static boolean isPalindromeLambda(String str) {
    return IntStream.range(0, str.length() / 2)
        .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
  }
  // time: O(N), space: O(1)

  public static boolean isPalindromeBest(String str) {
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
  // time: O(N^2), space: O(N)
  public static boolean isPalindromeString(String str) {
    String reverseString = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      reverseString = reverseString + str.charAt(i);
    }
    return str.equals(reverseString);
  }

  // recursion

  public static boolean isPalindromeRecursion(String str) {
    return isPalindromeRecursion(str, 0);
  }

  public static boolean isPalindromeRecursion(String str, int i) {
    int j = str.length() - 1 - i;
    return i >= j || str.charAt(i) == str.charAt(j) && isPalindromeRecursion(str, i + 1);
  }
}
