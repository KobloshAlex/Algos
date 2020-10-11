package leetcode.strings;

public class CorrectCapitalize {

  /*This question is asked by Google. Given a string, return whether or not it uses capitalization correctly.
       A string correctly uses capitalization if all letters are capitalized, no letters are capitalized,
       or only the first letter is capitalized.

  Ex: Given the following strings...

  "USA", return true
  "Calvin", return true
  "compUter", return false
  "coding", return true*/

  public static void main(String[] args) {
    System.out.println(isCorrect("USA"));
    //
  }

  public static final boolean isCorrect(String s) {

    int counter = 0;

    for (int i = 0; i < s.length(); i++) {
      //
      if (Character.isUpperCase(s.charAt(i))) {
        counter++;
      }
    }
    return counter == s.length()
        || counter == 0
        || (counter == 1 && Character.isUpperCase(s.charAt(0)));
  }
}
