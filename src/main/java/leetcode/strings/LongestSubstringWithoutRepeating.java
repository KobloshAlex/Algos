package leetcode.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcabcbb"));
  }

  public static int lengthOfLongestSubstring(String s) {

    int i = 0;
    int j = 0;
    int counter = 0;
    Set<Character> set = new HashSet<>();
    while (s.length() > j) {
      if (!set.contains(s.charAt(j))) {
        set.add(s.charAt(j));
        j++;
        counter = Math.max(counter, set.size());
      } else {
        set.remove(s.charAt(i));
        i++;
      }
    }
    return counter;
  }
}
