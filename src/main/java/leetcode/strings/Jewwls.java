package leetcode.strings;

import java.util.HashSet;
import java.util.Set;

public class Jewwls {
    /*
    * This question is asked by Amazon. Given a string representing your stones and another string
    * representing a list of jewels, return the number of stones that you have that are also jewels.

Ex: Given the following jewels and stones...

jewels = "abc", stones = "ac", return 2
jewels = "Af", stones = "AaaddfFf", return 3
jewels = "AYOPD", stones = "ayopd", return 0
* */
  public static void main(String[] args) {
    //
    System.out.println(countJewels("aA", "aAAbbbb"));
  }

  public static final int countJewels(String J, String S){

      Set<Character> set = new HashSet<>();
      int counter = 0;
      for(char c : J.toCharArray()) {
          set.add(c);
      }

    System.out.println(set);

      char[] chars = S.toCharArray();
      for (char c : chars) {
          if (set.contains(c)) {
              counter++;
          }
      }

      return counter;
  }
}
