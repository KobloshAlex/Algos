package leetcode.strings;

import java.util.Arrays;

public class ReverseEachLetter {
  public static void main(String[] args) {
    //
    String plain = "a1bcd efg!h";

    System.out.println(reverse(plain));
  }

  public static final String reverse(String plain) {
    String[] words = plain.split(" ");

    for (int k = 0; k < words.length; k++) {
      int i = 0;
      int j = plain.length() - 1;
      char[] letters = words[k].toCharArray();
      while (i < j) {
        char tmp = letters[i];
        letters[i] = letters[j];
        letters[j] = tmp;

        i++;
        j++;
      }
    }
    return Arrays.toString(words);
  }
}
