package leetcode.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInStringIII {
  public static void main(String[] args) {
    //
    System.out.println(reverseWords("Hello world"));
  }

  public static String reverseWords(String s) {
    String[] words = s.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String word : words) {

      sb.append(new StringBuilder(word).reverse().toString()).append(" ");
    }

    return sb.toString().trim();
  }

  public String reverseWordsJava8(String s) {
    String[] words = s.split(" ");
    String sb =
        Arrays.stream(words)
            .map(word -> new StringBuilder(word).reverse().toString() + " ")
            .collect(Collectors.joining());

    return sb.trim();
  }

  public String reverseWordsAlgo(String s) {
    int n = s.length();
    char[] c = s.toCharArray();
    for (int i = 0, j = 1; j <= n; j++) {
      if (j == n || c[j] == ' ') {
        reverse(c, i, j - 1);
        i = j + 1;
      }
    }
    return new String(c);
  }

  private void reverse(char[] c, int i, int j) {
    while (i < j) {
      char temp = c[i];
      c[i] = c[j];
      c[j] = temp;
      i++;
      j--;
    }
  }
}
