package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveArrayOccurrences {
  public static void main(String[] args) {
    System.out.println(remove(new ArrayList<>(Arrays.asList(1, 2, 1, 3, 1))));
  }

  private static List<Integer> remove(ArrayList<Integer> nums) {

    Set<Integer> integers = new LinkedHashSet<>(nums);
    return new ArrayList<>(integers);
  }
}
