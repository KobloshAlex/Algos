package leetcode.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWords {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(findWords("this apple is sweet", "this apple is sour")));
  }

  public static final String[] findWords(String A, String B) {
    Map<String, Integer> map = new HashMap<>();
    String[] aArray = A.split(" ");
    String[] bArray = B.split(" ");

    for (int i = 0; i < aArray.length; i++) {
      if (map.containsKey(aArray[i])) {
        map.put(aArray[i], map.get(aArray[i]) + 1);
      } else {
        map.put(aArray[i], 1);
      }
    }
    for (int i = 0; i < bArray.length; i++) {
      if (map.containsKey(bArray[i])) {
        map.put(bArray[i], map.get(bArray[i]) + 1);
      } else {
        map.put(bArray[i], 1);
      }
    }
    List<String> result = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1) {
        result.add(entry.getKey());
      }
    }

    /*
    * java8
    * map.entrySet().stream()
        .filter(value -> value.getValue() == 1)
        .map(Map.Entry::getKey)
        .toArray(String[]::new);
        * */
    return result.toArray(new String[0]);
  }
}
