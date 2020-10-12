package leetcode.strings;

public class AddBinaryInString {
  /*This question is asked by Apple. Given two binary strings (strings containing only 1s and 0s) return their
  sum (also as a binary string).
  Note: neither binary string will contain leading 0s unless the string itself is 0

  Ex: Given the following binary strings...

  "100" + "1", return "101"
  "11" + "1", return "100"
  "1" + "0", return  "1"*/
  public static void main(String[] args) {
    //

    System.out.println(addBinary("1011", "110"));
  }

  public static final String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;
    while (i >= 0 || j >= 0) {
      int sum = carry;
      if(i >= 0) {
        sum = sum + a.charAt(i--) - '0';
      }
      if(j >= 0) {
        sum = sum + b.charAt(j--) - '0';
      }
      sb.insert(0, sum % 2);
      carry = sum / 2;
    }
    if(carry > 0) {
      sb.insert(0, 1);
    }
    return sb.toString();
  }
}
