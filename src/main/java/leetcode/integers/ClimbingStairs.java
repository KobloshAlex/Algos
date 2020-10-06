package leetcode.integers;

public class ClimbingStairs {
  public static void main(String[] args) {
    System.out.println(climbStairs(5));
  }

  public static int climbStairs(int n) {
    int[] dp = new int[n + 1];
    dp[0] = 1;
    dp[1] = 1;
    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    // One can reach ith step in one of the two ways:
    // Taking a single step from (i-1)th step
    // Taking a step of 22 from (i-2)th step.
    return dp[n];
  }
}
