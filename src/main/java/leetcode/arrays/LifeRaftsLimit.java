package leetcode.arrays;

import java.util.Arrays;

public class LifeRaftsLimit {
  public static void main(String[] args) {
    //
    System.out.println(maxRafts(new int[] {1, 3, 5, 2}, 5));
    System.out.println(maxRafts(new int[] {1, 2}, 3));
    System.out.println(maxRafts(new int[] {4, 2, 3, 3}, 5));
    System.out.println(maxRafts1(new int[] {1, 3, 5, 2}, 5));
  }

  public static final int maxRafts(int[] weights, int limit) {
    double sum = 0;
    for (int weight : weights) {

      sum = sum + weight;
    }
    return (int) Math.ceil(sum / limit);
  }

  public static final int maxRafts1(int[] weights, int limit) {
    Arrays.sort(weights);
    int raftCounter = 0;
    int i = 0;
    int j = weights.length - 1;

    while (i <= j) {
      if (weights[i] + weights[j] <= limit) {
        i++;
        j--;
      } else {
        j--;
      }
      raftCounter++;
    }

    return raftCounter;
  }
}
