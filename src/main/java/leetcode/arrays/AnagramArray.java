package leetcode.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AnagramArray {

  public static void main(String[] args) {

    char[] charsOne = {'r', 'e', 'e', 'r'};
    char[] charsTwo = {'r', 'e', 'e', 'r'};

    System.out.println(isAnagram(charsOne, charsTwo));
  }

  public static boolean isAnagram(char[] charsOne, char[] charsTwo) {

    if (charsOne.length != charsTwo.length) {
      return false;
    }
    Arrays.sort(charsOne);
    Arrays.sort(charsTwo);

    for (int i = 0; i < charsOne.length; i++) {
      if (charsOne[i] != charsTwo[i]) {
        return false;
      }
    }
    return true;
  }

  public static boolean isAnagramSteam(char[] charsOne, char[] charsTwo) {

    if (charsOne.length != charsTwo.length) {
      return false;
    }
    Arrays.sort(charsOne);
    Arrays.sort(charsTwo);

    return IntStream.range(0, charsOne.length).noneMatch(i -> charsOne[i] != charsTwo[i]);
  }
}
