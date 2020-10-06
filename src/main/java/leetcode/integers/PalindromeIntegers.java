package leetcode.integers;

public class PalindromeIntegers {
  public static void main(String[] args) {
    System.out.println(isPalindrome(121));
  }

  public static boolean isPalindrome(int x) {
    final char[] chars = String.valueOf(x).toCharArray();
    int i = 0;
    int j = chars.length - 1;
    while (j > i) {
      if (chars[i] != chars[j]) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
