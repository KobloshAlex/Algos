package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramsInArray {
  public static void main(String[] args) {
    //
//    System.out.println(
//        groupAnagrams(
//            new ArrayList<>(Arrays.asList("car", "rac", "gee", "eeg", "tre", "ert", "rte"))));
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> anagrams = new HashMap<>();
    for (String word : strs) {
      char[] chars = word.toCharArray();
      Arrays.sort(chars);
      String sortedWord = new String(chars);
      //System.out.print(sortedWord + " ");

      if (anagrams.containsKey(sortedWord)) {
        anagrams.get(sortedWord).add(word);
        System.out.println(anagrams);
      } else {
        anagrams.put(sortedWord, new ArrayList<>(Collections.singletonList(word)));
      }
    }
    return new ArrayList<>(anagrams.values());
  }
}
