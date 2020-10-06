package algoexpert.string;

public class LongestPolindrome {

  public static void main(String[] args) {
    System.out.println(longestPalindromicSubstring("abaracecar"));
  }

  public static String longestPalindromicSubstring(String str) {
    // Write your code here.

    if (str == null || str.length() < 1) {
      return "";
    }

    int start = 0;
    int end = 0;

    for (int i = 0; i < str.length(); i++) {
      int len1 = expendFromMiddle(str, i, i);
      int len2 = expendFromMiddle(str, i, i + 1);
      int len = Math.max(len1, len2);

      if (len > end - start) {
        start = i - ((len - 1) / 2);
        end = i + (len / 2);
      }
    }
    return str.substring(start, end + 1);
  }

  private static int expendFromMiddle(String str, int left, int right) {

    if (str == null || left > right) {
      return 0;
    }
    while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
      left--;
      right++;
    }

    return right - left - 1;
  }
}
