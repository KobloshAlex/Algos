package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
  public static void main(String[] args) {
    //
    System.out.println(subsets(new int[] {1, 2, 3}));
  }

  public static List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    res.add(new ArrayList<>());

    for (int i : nums) {
      List<List<Integer>> tmp = new ArrayList<>();
      for (List<Integer> sub : res) {
        List<Integer> a = new ArrayList<>(sub);
        a.add(i);
        tmp.add(a);
      }
      res.addAll(tmp);
    }
    return res;
  }
}
