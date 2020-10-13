package leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInString {

  public static void main(String[] args) {
    //
  }

  public static final List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new ArrayList<>();

    if (s.length() == 0 || s == null) {
      return result;
    }
    // create array with the size of alphabet
    int[] charCounts = new int[26];
    for (char c : p.toCharArray()) {
      charCounts[c - 'a']++; // get the ASCII absolute value
    }
    int left = 0;
    int right = 0;
    int count = p.length();

    while (right < s.length()) {
      if (charCounts[s.charAt(right++) - 'a']-- >= 1) count--; // if char that we looking the value of that we want to decrement the count

      if(count == 0) result.add(left); // find anagram

      if(right - left == p.length() && charCounts[s.charAt(left ++) - 'a']++ >= 0) count ++; //once window expend to the size of the window, want to start left part
    }
    return result;
  }
}
