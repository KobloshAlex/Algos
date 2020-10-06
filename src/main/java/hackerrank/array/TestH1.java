package hackerrank.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestH1 {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("we promptly judged antique ivory buckles for the next prize");
    list.add("we promptly judged antique ivory buckles for the next prie");
    System.out.println(isPangram(list));
  }

  public static String isPangram(List<String> pangram) {
    StringBuilder builder = new StringBuilder();
    for (String str : pangram) {
      str.toUpperCase();
      HashSet<Character> characters =
          IntStream.range(0, str.length())
              .filter(i -> str.charAt(i) != ' ')
              .mapToObj(str::charAt)
              .collect(Collectors.toCollection(HashSet::new));

      if (characters.size() == 26) {
        builder.append("1");
      } else {
        builder.append("0");
      }
    }
    return builder.toString();
  }
}
