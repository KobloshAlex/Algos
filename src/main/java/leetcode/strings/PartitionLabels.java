package leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
  public static void main(String[] args) {
    //
    System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
  }

  public static List<Integer> partitionLabels(String S) {

    List<Integer> result = new ArrayList<>();

    if (S == null || S.length() == 0) {
      return null;
    }

    int[] lastIndex = new int[26];
    for (int i = 0; i < S.length(); i++) {
      lastIndex[S.charAt(i) - 'a'] = i;
    }

    int start = 0;
    int end = 0;
    for (int i = 0; i < S.length(); i++) {
      end = Math.max(end, lastIndex[S.charAt(i) - 'a']);

      if(i == end) {
        result.add(end - start + 1);
        start = end + 1;
      }
    }
    return result;
  }
}
