package leetcode.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given words first and second, consider occurrences in some text of the form "first second third",
where second comes immediately after first, and third comes immediately after second.

For each such occurrence, add "third" to the answer, and return the answer.



Example 1:

Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
Output: ["girl","student"]
Example 2:

Input: text = "we will we will rock you", first = "we", second = "will"
Output: ["we","rock"]*/
public class OccurrencesAfterBigram {
  public static void main(String[] args) {
    //

    System.out.println(Arrays.toString(findWords("alice is a good girl she is a good student", "a", "good")));
  }

  public static final String[] findWords(String text, String first, String second) {
    String[] words = text.split(" ");

    List<String> result = new ArrayList<>();
    for (int i = 2; i < words.length ; i++) {
      if (words[i - 2].equals(first) && words[i - 1].equals(second)) {
        result.add(words[i]);
      }
    }

    return result.toArray(new String[0]);
  }
}
