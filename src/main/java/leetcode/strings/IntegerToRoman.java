package leetcode.strings;

public class IntegerToRoman {
  public static void main(String[] args) {
    System.out.println(doCalc(1431));

    System.out.println(((1431 % 10000) + " | " + (1431 % 10000) / 1000));
    System.out.println((1431 % 1000) + " | " + (1431 % 1000) / 100);
    System.out.println((1431 % 100) + " | " + (1431 % 100) / 10);
    System.out.println(1431 % 10);
  }

  public static final String doCalc(int num) {

    String[] units = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    String[] tens = new String[] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] hundreds = new String[] {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] thousands = new String[] {"", "M", "MM", "MMM"};

    return thousands[(num % 10000) / 1000]
        + hundreds[(num % 1000) / 100]
        + tens[(num % 100) / 10]
        + units[num % 10];
  }
}
