package leetcode.strings;

public class LongestPolindrome {

  public static void main(String[] args) {
    System.out.println(longestPalindrome("abaracecar"));
  }

  public static String longestPalindrome(String s) {
    // Write your code here.

    if (s == null || s.length() < 1) {
      return "";
    }

    int start = 0;
    int end = 0;

    for (int i = 0; i < s.length(); i++) {
      // case for "abcdcba"
      int len1 = expendFromMiddle(s, i, i);
      // case for "abccba"
      int len2 = expendFromMiddle(s, i, i + 1);
      // pick the longest using max
      int len = Math.max(len1, len2);

      if (len > end - start) {

        start = i - ((len - 1) / 2);
        end = i + (len / 2);
      }
    }
    return s.substring(start, end + 1);
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
