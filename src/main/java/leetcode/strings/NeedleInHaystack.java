package leetcode.strings;

public class NeedleInHaystack {

  // Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of
  // haystack.
  public static void main(String[] args) {
    System.out.println(doCalc("Hello", "lo"));
  }

  public static final int doCalc(String haystack, String needle) {
    if (needle.isEmpty()) {
      return 0;
    }
    if (needle.length() > haystack.length()) {
      return -1;
    }
    // for (int i = 0; i < haystack.length() - needle.length; i++)
    for (int i = 0; i <= haystack.length(); i++) {
      String substringHaystack = haystack.substring(i, i + needle.length());
      if (substringHaystack.equals(needle)) {
        return i;
      }
    }
    return -1;
  }
}
