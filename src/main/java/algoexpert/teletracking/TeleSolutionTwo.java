package algoexpert.teletracking;

import java.util.Arrays;

public class TeleSolutionTwo {
  public static void main(String[] args) {
    int[] arrival1 = {1, 3, 3, 5, 7};
    int[] duration1 = {2, 2, 1, 2, 1};
    System.out.println(doCalc(arrival1, duration1));
  }

  public static int doCalc(int[] arrival, int[] duration) {
    int dropCompany = 0;
    int numberOfEvents = arrival.length;
    int[][] intervals = new int[numberOfEvents][2];

    for (int i = 0; i < numberOfEvents; i++) {
      intervals[i] = new int[] {arrival[i], arrival[i] + duration[i]};
      System.out.println(Arrays.toString(intervals[i]));
    }
    System.out.println();
    Arrays.sort(intervals, (a, b) -> (a[1] - b[1]));
    for (int i = 0; i < intervals.length; i++) {
      System.out.println(Arrays.toString(intervals[i]));
    }

    int curTime = intervals[0][1];
    System.out.println(curTime);
    for (int i = 0; i < numberOfEvents; i++) {
      int[] toSchedual = intervals[i];
      System.out.println(Arrays.toString(toSchedual));
      if (toSchedual[0] < curTime) {
        System.out.println("toSchedual[0] " + Arrays.toString(new int[] {toSchedual[0]}));
        System.out.println("curtime " + curTime);
        dropCompany++;
        System.out.println("drop " + dropCompany);
      } else {
        curTime = toSchedual[1];
      }
    }
    return numberOfEvents - dropCompany;
  }
}
