package algoexpert.string;

public class AllUniqueSubstrings {

  static String LexicographicalMaxString(String str) {
    // loop to find the max leicographic
    // substring in the substring array
    String mx = "";
    for (int i = 0; i < str.length(); ++i) {
      if (mx.compareTo(str.substring(i)) <= 0) {
        mx = str.substring(i);
      }
    }

    return mx;
  }
}
