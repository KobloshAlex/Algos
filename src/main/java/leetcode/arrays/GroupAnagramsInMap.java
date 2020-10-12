package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramsInMap {
  public static void main(String[] args) {
    System.out.println(
            findAnagrams(
                    new ArrayList<>(Arrays.asList("car", "rac", "gee", "eeg", "tre", "ert", "rte"))));
  }

  public static final Map<String, Integer> findAnagrams(List<String> words) {
    Map<String, Integer> map = new HashMap<>();
    Map<String, Integer> result = new HashMap<>();


    for (String word : words) {
      char[] chars = word.toCharArray();
      Arrays.sort(chars);

      String sortedWord = new String(chars);

     // System.out.println(sortedWord);

      if(map.containsKey(sortedWord)) {
        map.put(sortedWord, map.get(sortedWord) + 1);
        result.put(word,(map.get(sortedWord) + 1) - 1);
      } else {
        map.put(sortedWord, 1);

      }
    }

    return result;
  }
}
