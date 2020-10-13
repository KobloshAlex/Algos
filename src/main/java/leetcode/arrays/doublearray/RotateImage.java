package leetcode.arrays.doublearray;

import java.util.Arrays;

public class RotateImage {
  public static void main(String[] args) {
    //

    rotate(new int[][] {{1,2, 3}, {4, 5, 6}, {7,8,9}});
  }

  public static void rotate(int[][] matrix) {
    int n = matrix.length;

    // convert rows to columns by using diagonal converting
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = tmp;
      }
    }
    System.out.println(Arrays.deepToString(matrix));

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < (n / 2); j++) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[i][n - 1 - j];
        matrix[i][n - 1 - j] = tmp;
      }
    }
    System.out.println(Arrays.deepToString(matrix));
  }
}
