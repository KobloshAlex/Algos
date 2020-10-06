package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantesis {
  public List<String> generateParenthesis(int n) {
    List<String> list = new ArrayList<>();
    if (n == 0) {
      return list;
    }

    helper(list, "", 0, 0, n);
    return list;
  }

  private void helper(List<String> list, String list2, int left, int right, int m) {
    if (list2.length() == m * 2) {
      list.add(list2);
      return;
    }

    if (left < m) {
      helper(list, list2 + "(", left + 1, right, m);
    }
    if (right < left) {
      helper(list, list2 + ")", left, right + 1, m);
    }
  }
}
