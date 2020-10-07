package leetcode.strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowelsInString {

  public static void main(String[] args) {
    //
    System.out.println(removeVowels("hEllo"));
  }

  public static final String removeVowels(String s) {
//[hello]
    if(s == null || s.length() == 0) {
      return "";
    }
    Set<Character> vowels = new HashSet<>();
    vowels.add('e');
    vowels.add('E');
    vowels.add('u');
    vowels.add('U');
    vowels.add('i');
    vowels.add('I');
    vowels.add('o');
    vowels.add('O');
    vowels.add('a');
    vowels.add('A');
    char[] chars = s.toCharArray();
    int i = 0;
    int j = chars.length -1;
    while (j > i) {
      if(!vowels.contains(chars[i])) {
        i++;
      } else if( !vowels.contains(chars[j])) {
        j--;
      }
      else {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        i ++;
        j --;
      }
    }
    return new String(chars);
  }
}
