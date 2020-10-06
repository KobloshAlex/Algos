package leetcode.arrays.doublearray;

import java.util.Arrays;

public class MeetingRooms {
  public static void main(String[] args) {
    Interval interval2 = new Interval(1, 3);

    Interval interval1 = new Interval(2, 4);
    Interval[] interval = new Interval[] {interval2, interval1};
    System.out.println(canAttend(interval));
  }

  private static boolean canAttend(Interval[] intervals) {
    int[] starts = new int[intervals.length];
    int[] ends = new int[intervals.length];
    for (int i = 0; i < intervals.length; i++) {
      starts[i] = intervals[i].start;
      ends[i] = intervals[i].end;
    }

    Arrays.sort(starts);
    Arrays.sort(ends);

    for (int i = 0; i < starts.length - 1; i++) {
      if (starts[i + 1] < ends[i]) {
        return false;
      }
    }
    return true;
  }
}

class Interval {
  int start;
  int end;

  public Interval() {
    start = 0;
    end = 0;
  }

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
}
