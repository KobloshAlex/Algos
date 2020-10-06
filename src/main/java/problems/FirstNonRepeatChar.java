package problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatChar {

  public static void main(String[] args) {
    doJob("swiss");
  }

  // "swiss"
  private static void doJob(String string) {

    Map<Character, Integer> map = new LinkedHashMap<>();
    int counter = 1;
    for (char c : string.toLowerCase().toCharArray()) {
      if (map.containsKey(c)) {
        counter++;
      }
      map.put(c, counter);
    }

    for (Map.Entry<Character, Integer> mapValue : map.entrySet()) {
      if (mapValue.getValue() == 1) {
        System.out.println(mapValue.getKey());
        break;
      }
    }

    map.entrySet().stream()
        .filter(entry -> entry.getValue() == 1)
        .findFirst()
        .ifPresent(entry -> System.out.println(entry.getKey()));
  }
}
