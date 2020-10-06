package test;

public class ValueCounterHacker {

  public static void main(String[] args) {
    System.out.println(countingValleys(8, "UDDDUDUU"));
  }

  // n == steps (4)
  // s == pattern (UDDUDUD)
  // 0   _  _      valueCount++
  // -1   \/
  // -2
  //
  //
  static int countingValleys(int n, String s) {
    int altitude = 0;
    int valleyCount = 0;
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == 'U') {
        altitude++;
        if (altitude == 0) {
          valleyCount++;
        }
      } else {
        altitude--;
      }
    }
    return valleyCount;
  }
}
