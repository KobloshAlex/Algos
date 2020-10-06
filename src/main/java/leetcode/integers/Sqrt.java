package leetcode.integers;

public class Sqrt {
  public static void main(String[] args) {
    System.out.println(doCalc(2147395599));
    System.out.println(doCalc1(8));
  }

  // Brute O(n)
  public static final int doCalc(int x) {
    long sqrt = x;
    for (int i = 0; i < 10000; i++) {
      if ((int) (Math.sqrt(sqrt)) == i) {
        return i;
      }
    }
    return -1;
  }

  // O logn

  public static final int doCalc1(int x) {

    if (x <= 1) {
      return x;
    }

    int start = 1;
    int end = x / 2;

    while (start < end) {
      // start is not always moving and hence we can get stuck in infinite loop with mid calculation
      // Adding 1 to mid everytime to ensure we always move the mid
      int mid = (start + (end - start) / 2) + 1;

      int div = x / mid;
      if (div == mid) {
        return mid;
      }
      if (div > mid) {
        start = mid;
      } else {
        end = mid - 1;
      }
    }
    return start;
  }
}
