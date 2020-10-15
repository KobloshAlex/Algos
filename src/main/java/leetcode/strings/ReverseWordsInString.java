package leetcode.strings;

import java.util.Arrays;

public class ReverseWordsInString {
  public static void main(String[] args) {
    //

    System.out.println(reverse("Hello world"));
  }

  public static final String reverse(String  s) {
      String[] words = s.trim().split(" ");

      int i = 0;
      int j = words.length - 1;

      while (i < j) {
          String tmp = words[i];
          words[i] = words[j];
          words[j] = tmp;

          i++;
          j--;
      }
      return String.join(" ", words);
  }
}
