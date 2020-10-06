package hackerrank.array;

import java.util.ArrayList;
import java.util.List;

public class TestH {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("10 2 5");
    list.add("12 4 4");

    maximumContainers2(list);
  }

  public static void maximumContainers2(List<String> scenarios) {

    int n;
    int cost;
    int m;
    for (String scenario : scenarios) {
      String[] str = scenario.split(" ");
      n = Integer.parseInt(str[0]);
      cost = Integer.parseInt(str[1]);
      m = Integer.parseInt(str[2]);

      int total = 0;
      int container = n / cost;

      total += container;
      while (container >= m) {
        total += container / m;
        int temp = container % m;
        container = temp + (container / m);
      }
      System.out.println(total);
    }
  }
}
