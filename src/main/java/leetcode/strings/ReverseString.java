package leetcode.strings;

public class ReverseString {
  public static void main(String[] args) {
    System.out.println(reverse("Hello"));
  }

  public static final String reverse(String s) {

    char[] chars = s.toCharArray();
    int i = 0;
    int j = s.length() - 1;

    while (j > i) {
      char tmp = chars[i];
      chars[i] = chars[j];
      chars[j] = tmp;

      i++;
      j--;
    }
    return new String(chars);
  }
}
