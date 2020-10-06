package hackerrank.prime;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    calculate(scanner.nextBigInteger(), scanner.nextBigInteger());
  }

  private static void calculate(BigInteger a, BigInteger b) {
    System.out.println(a.add(b));
    System.out.println(a.multiply(b));
  }
}
