package test;

public class JumpingOnTheCloudsHacker {
  public static void main(String[] args) {
    System.out.println(jumpingOnClouds(new int[] {0, 0, 0, 0, 1, 0}));
  }

  static int jumpingOnClouds(int[] c) {
    int count = 0;

    for (int i = 0; i < c.length; ) {
      if (i + 2 < c.length && c[i + 2] == 0) {
        i = i + 2;
      } else {
        i = i + 1;
      }
      count++;
    }
    return count - 1;
  }
}
