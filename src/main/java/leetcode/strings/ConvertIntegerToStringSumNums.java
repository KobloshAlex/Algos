package leetcode.strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertIntegerToStringSumNums {
  public static void main(String[] args) {

    System.out.println(test(50421));
  }

  public static String test(int a) {
    String result = a + "";
    StringBuilder ans = new StringBuilder();

    for (int i = 0; i < result.length(); i++) {
      if (result.charAt(i) != '0') {
        int answer =
            (int)
                (Integer.parseInt(String.valueOf(result.charAt(i)))
                    * Math.pow(10, result.length() - 1 - i));
        ans.append(answer).append(" + ");
      }
    }
    return ans.toString().substring(0, ans.length() - 3);
  }

  public static String testJava8(int a) {
    String result = a + "";
    String ans =
        IntStream.range(0, result.length())
            .filter(i -> result.charAt(i) != '0')
            .map(
                i ->
                    (int)
                        (Integer.parseInt(String.valueOf(result.charAt(i)))
                            * Math.pow(10, result.length() - 1 - i)))
            .mapToObj(answer -> answer + " + ")
            .collect(Collectors.joining());

    return ans.substring(0, ans.length() - 3);
  }
}
