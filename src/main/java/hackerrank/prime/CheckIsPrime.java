package hackerrank.prime;

import java.math.BigInteger;
import java.util.Scanner;

public class CheckIsPrime {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println(
        new BigInteger(scanner.nextLine()).isProbablePrime(1) ? "prime" : "not prime");
    scanner.close();
  }
}
