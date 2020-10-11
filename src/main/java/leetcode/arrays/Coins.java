package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class Coins {
  public static void main(String[] args) {
    int[] A = {0,1,0};
    System.out.println(solution(A));
  }

  public static int solution(int[] A) {
      int ans = 0;
      for (int i = 0; i < A.length; i++) {
          if (i % 2 == 0 && A[i] == 1)
              ans++;
          if (i % 2 == 1 && A[i] == 0)
              ans++;
      }

      return Math.min(ans, A.length - ans);
  }



}
