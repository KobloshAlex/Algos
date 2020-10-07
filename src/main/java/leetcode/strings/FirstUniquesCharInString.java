package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniquesCharInString {
  /*Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.*/
  public static void main(String[] args) {
    //
    System.out.println(findUnique("aaabbbcd"));
  }

  public static int findUnique(String s) {

    char[] chars = s.toCharArray();
    Map<Character, Integer> map = new HashMap<>();
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

    return min == Integer.MAX_VALUE ? -1 : min;
  }
}
