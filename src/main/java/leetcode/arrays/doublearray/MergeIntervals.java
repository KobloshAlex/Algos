package leetcode.arrays.doublearray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(merge(new int[][] {{1, 3}, {2, 6}, {8, 16}, {15, 18}})));
  }

  public static int[][] merge(int[][] intervals) {

    if (intervals.length <= 1) {
      return intervals;
    }
    // sort begining values of the sub arrays
    Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

    // create a list cuz I dont know the size of return ( make return first)
    List<int[]> output = new ArrayList<>();
    // take first sub arrya and put in into list
    int[] currentInterval = intervals[0];
    output.add(currentInterval);

    for (int[] interval : intervals) {

      int currentBegin = currentInterval[0];
      int currentEnd = currentInterval[1];

      int nextBegin = interval[0];
      int nextEnd = interval[1];

      if (currentEnd >= nextBegin) {
        // update the subarray with max of the ending value of two arrays
        currentInterval[1] = Math.max(currentEnd, nextEnd);
      } else {
        // if no overlap, update array and and to result and process completely restart
        currentInterval = interval;
        output.add(currentInterval);
      }
    }
    return output.toArray(new int[output.size()][]);
  }
}
