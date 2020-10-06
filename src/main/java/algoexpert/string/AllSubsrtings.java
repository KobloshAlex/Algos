package algoexpert.string;

public class AllSubsrtings {

  public static void main(String[] args) {

    System.out.println(getAllSubstrings("abcd"));
  }

  public static String getAllSubstrings(String str) {

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        System.out.println(str.substring(i, j));
      }
    }

    return stringBuilder.toString();
  }
}
