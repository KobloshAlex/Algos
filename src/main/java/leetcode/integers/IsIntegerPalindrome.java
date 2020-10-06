package leetcode.integers;

public class IsIntegerPalindrome {
  public static void main(String[] args) {

    System.out.println(isPolindrome(312121));
    System.out.println(isPolindromeTwo(12121));
    System.out.println(reverseString("Hello"));
  }

  private static boolean isPolindrome(int number) {

    if (number < 0 || (number % 10 == 0 && number != 0)) {
      return false;
    }

    int reverseNumber = 0;

    while (number > reverseNumber) {
      int pop = number % 10;
      reverseNumber = reverseNumber * 10 + pop;
      number = number / 10;
    }
    return number == reverseNumber || number == reverseNumber / 10;
  }

  private static boolean isPolindromeTwo(int number) {

    final char[] nums = String.valueOf(number).toCharArray();

    int i = 0;
    int j = nums.length - 1;
    while (j > i) {
      if (nums[i] != nums[j]) {
        return false;
      }
      j--;
      i++;
    }
    return true;
  }

  private static String reverseString(String str) {

    final char[] chars = str.toCharArray();

    int i = 0;
    int j = chars.length - 1;

    while (j > i) {
      char temp = chars[i];
      chars[i] = chars[j];
      chars[j] = temp;
      j--;
      i++;
    }

    return new String(chars);
  }
}
