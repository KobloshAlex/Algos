package leetcode.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SpotTheDifference {
  /*
      * This question is asked by Google. You are given two strings, s and t which only consist of lowercase letters. t is generated by shuffling the letters in s as well as potentially adding an additional random character. Return the letter that was randomly added to t if it exists, otherwise, return ’ ‘.
  Note: You may assume that at most one additional character can be added to t.

  Ex: Given the following strings...

  s = "foobar", t = "barfoot", return 't'
  s = "ide", t = "idea", return 'a'
  s = "coding", t "ingcod", return ''
  * */

  public static void main(String[] args) {

    System.out.println(findDifference("foobar", "barfoot"));
    //
  }

  public static final String findDifference(String s, String t){

      Set<Character> set = new HashSet<>();
      StringBuilder stringBuilder = new StringBuilder();
      
      for(char c :  s.toCharArray()){
          set.add(c);
      }
      for(char c : t.toCharArray()) {
          if(!set.contains(c)){
              stringBuilder.append(c);
          }
      }

      return stringBuilder.toString();
  }
}
