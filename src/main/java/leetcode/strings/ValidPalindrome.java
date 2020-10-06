package leetcode.strings;

public class ValidPalindrome {

  public static void main(String[] args) {
    System.out.println(doCalc("A man, a plan, a canal: Panama"));
  }

  public static final boolean doCalc(String s) {

    StringBuilder fixedStringBuilder = new StringBuilder();
    for (char c : s.toLowerCase().toCharArray()) {
      if (Character.isLetter(c) || Character.isDigit(c)) {
        fixedStringBuilder.append(c);
      }
    }
    String fixedString = fixedStringBuilder.toString();
    System.out.println(fixedString);

    int i = 0;
    int j = fixedString.length() - 1;

    while (j >= i) {
      if (fixedString.charAt(j) != fixedString.charAt(i)) {
        return false;
      }
      i++;
      j--;
    }

    return true;
  }
}
