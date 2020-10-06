package algoexpert;

public class CalculateNthFib {
  public static int getNthFib(int n) {

    if (n == 1) {
      return 0;
    } else if (n == 2) {
      return 1;
    }

    return getNthFib(n - 1) + getNthFib(n - 2);
  }

  public static void main(String[] args) {
    System.out.println(getNthFib(3));
  }

  public static int getNthFibCache(int n) {

    if (n == 1) {
      return 0;
    } else if (n == 2) {
      return 1;
    }

    return getNthFib(n - 1) + getNthFib(n - 2);
  }

  // --------------------

  public static int getNthFibBest(int n) {

    int[] lastTwo = {0, 1};
    int counter = 3;
    while (counter < n) {
      int nextFib = lastTwo[0] + lastTwo[1];
      lastTwo[0] = lastTwo[1];
      lastTwo[1] = nextFib;
      counter += 1;
    }
    return n > 1 ? lastTwo[1] : lastTwo[0];
  }
}
