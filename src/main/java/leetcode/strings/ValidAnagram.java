package leetcode.strings;

import java.util.Arrays;

public class ValidAnagram {

  public static void main(String[] args) {
    System.out.println(isValid("anagram", "nagaram"));
  }

  public static final boolean isValid(String s, String t) {

      char[] charS = s.toCharArray();
      char[] charT = t.toCharArray();
      Arrays.sort(charS);
      Arrays.sort(charT);

      return Arrays.equals(charS, charT);
  }

}
