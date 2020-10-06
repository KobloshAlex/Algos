package leetcode.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
  public static void main(String[] args) {

    int[] collect = IntStream.range(1, 5).map(i -> i++).toArray();

    System.out.println(reverseString("1Helllo"));

    // temp = 1
    // [1,2,3,4]

    int startIdx = 0;
    int endIdx = collect.length - 1;

    //        while (endIdx > startIdx) {
    //            int temp = collect[startIdx];
    //            collect[startIdx] = collect[endIdx];
    //            collect[endIdx] = temp;
    //            startIdx++;
    //            endIdx--;
    //        }
    //
    //        System.out.println(Arrays.toString(collect));

    // [1, 2, 3, 4]
    for (int i = 0; i < collect.length / 2; i++) {
      int temp = collect[i];
      collect[i] = collect[collect.length - (1 + i)];
      collect[collect.length - (1 + i)] = temp;
    }

    System.out.println(Arrays.toString(collect));
  }

  private static String reverseString(String word) {

    final char[] chars = word.toCharArray();
    for (int i = 0; i < chars.length / 2; i++) {

      if (Character.isLetter(chars[i])) {
        char tmp = chars[i];
        chars[i] = chars[chars.length - (1 + i)];
        chars[chars.length - (1 + i)] = tmp;
      }
    }

    return new String(chars);
  }
}
