package algoexpert.teletracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestHaker {

  public static void main(String[] args) {
    int[] arrival1 = {1, 3, 3, 5, 7};
    List<Integer> arrivals = new ArrayList<>(Arrays.asList(1, 3, 3, 5, 7));
    List<Integer> duration = new ArrayList<>(Arrays.asList(2, 2, 1, 2, 1));
    int[] duration1 = {2, 2, 1, 2, 1};
    System.out.println(maxEvents(arrivals, duration));
  }

  public static int maxEvents(List<Integer> arrival, List<Integer> duration) {

    int[][] intervals = new int[arrival.size()][2];

    for (int i = 0; i < arrival.size(); i++) {
      intervals[i][0] = arrival.get(i);
      intervals[i][1] = arrival.get(i) + duration.get(i);
      System.out.println(Arrays.toString(intervals[i]));
    }
    System.out.println();
    Arrays.sort(intervals, Comparator.comparingInt(number -> number[1]));

    int numberOfPresentation = 1;
    int scheduleTime = intervals[0][1];
    for (int[] ints : intervals) {
      int startPeriod = ints[0];
      int endPeriod = ints[1];
      //            System.out.println("startPeriod " + startPeriod + " endPeriod " + endPeriod);
      //            System.out.println("scheduleTime " + scheduleTime);
      if (startPeriod >= scheduleTime) {
        numberOfPresentation++;
        scheduleTime = endPeriod;
      }
    }
    return numberOfPresentation;
  }
}
