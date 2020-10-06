package test;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {

    String s = "ared";
    String s1 = "dare";

    System.out.println(check1(s, s1));
  }

  // URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the
  // string
  // has sufficient space at the end to hold the additional characters, and that you are given the
  // "true"
  // length of the string. (Note: If implementing in Java, please use a character array so that you
  // can
  // perform this operation in place.)
  public static String check(String line) {
    return line.trim().replaceAll(" ", "%22");
  }

  // Check Permutation: Given two strings, write a method to decide if one is a permutation of the
  // other.
  public static boolean check1(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    final char[] charsS = s.toLowerCase().toCharArray();
    final char[] charsT = t.toLowerCase().toCharArray();
    Arrays.sort(charsS);
    Arrays.sort(charsT);

    return Arrays.toString(charsS).equals(Arrays.toString(charsT));
  }
}
