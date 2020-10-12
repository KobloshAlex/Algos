package problems;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
  public static void main(String[] args) {

    //        List<String> result = new ArrayList<>();
    //        for (int i = 0; i < 100; i++) {
    //          if (i % 3 == 0) {
    //            if (i % 5 == 0) {
    //              System.out.println("fizzbuzz");
    //
    //            }
    //            System.out.println("fizz");
    //          } else if (i % 5 == 0) {
    //            System.out.println("buzz");
    //          } else {
    //            System.out.println(i);
    //          }
    //        }
    System.out.println(fizzBuzz(30));
  }

  public static final List<String> fizzBuzz(int n) {
    List<String> result = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        result.add("FizzBuzz");
      } else if (i % 3 == 0) {
        result.add("Fizz");
      } else if (i % 5 == 0) {
        result.add("Buzz");
      } else {
        result.add(i + "");
      }
    }
    return result;
  }
}
