package leetcode.strings;

public class LengthOfLastWord {
  public static void main(String[] args) {

    System.out.println(countLength("a "));
  }

  private static int countLength(String s) {

    int counter = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) != ' ') {
        counter++;
      } else if (counter > 0) {
        return counter;
      }
    }
    return counter;
  }
}
