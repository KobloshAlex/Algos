package leetcode.strings;

import java.util.HashSet;
import java.util.Set;

public class OnlyUniqueDigitsFromString {
  public static void main(String[] args) {
    //
    System.out.println(getDigits("asd132ds671 434 r61ds"));
  }

  public static final Set<Character> getDigits(String s) {

      Set<Character> result = new HashSet<>();

      for(char c : s.toCharArray()) {
          if (Character.isDigit(c)) {
              result.add(c);
          }
      }
      return result;
  }
}
