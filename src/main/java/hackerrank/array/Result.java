package hackerrank.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("bin", "can", "bin", "bin"));

    System.out.println(groupTransactions(list));
  }

  public static List<String> groupTransactions(List<String> transactions) {

    Map<String, Integer> counts = new HashMap<>();
    for (String str : transactions) {
      if (counts.containsKey(str)) {
        counts.put(str, counts.get(str) + 1);
      } else {
        counts.put(str, 1);
      }
    }

    List<String> result = new ArrayList<>();
    for (Map.Entry<String, Integer> stringIntegerEntry : counts.entrySet()) {
      result.add(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
    }

    result.sort(Comparator.naturalOrder());
    return result;
  }
}
