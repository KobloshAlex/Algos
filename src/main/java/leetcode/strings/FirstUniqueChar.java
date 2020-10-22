package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

  /*
      * This question is asked by Microsoft. Given a string, return the index of its first unique character.
      * If a unique character does not exist, return -1.

  Ex: Given the following strings...

  "abcabd", return 2
  "thedailybyte", return 1
  "developer", return 0
  */

  public static void main(String[] args) {
    System.out.println(findIndex("loveleetcode"));
  }

  public static final int findIndex(String s) {
    Map<Character, Integer> map = new HashMap<>();

    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (!map.containsKey(chars[i])) {
        map.put(chars[i], i);
      } else {
        map.put(chars[i], -1);
      }
    }
    int min = Integer.MAX_VALUE;
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() > -1 && entry.getValue() < min) {
        min = entry.getValue();
      }
    }
    return min == Integer.MAX_VALUE ? 0 : min;
  }
}
