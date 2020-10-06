package leetcode.strings;

public class AllUniqueSubstrings {

  static String LexicographicalMaxString(String str) {
    // loop to find the max leicographic
    // substring in the substring array
    String result = "";
    for (int i = 0; i < str.length(); ++i) {
      if (result.compareTo(str.substring(i)) <= 0) {
        result = str.substring(i);
      }
    }

    return result;
  }
}
