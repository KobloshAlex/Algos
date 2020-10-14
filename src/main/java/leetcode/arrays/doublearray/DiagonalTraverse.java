package leetcode.arrays.doublearray;

import java.util.Arrays;
import java.util.Comparator;

public class DiagonalTraverse {

  public static void main(String[] args) {
    //
  }

  public static final int[] findDiagonal(int[][] matrix) {
    if (matrix.length == 0) {
      return new int[] {};
    }

    int[][] arrd = new int[matrix.length * matrix[0].length][3];
    int[] res = new int[arrd.length];
    int index = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        arrd[index++] = new int[] {i + j, j, matrix[i][j]};
      }
    }
    Arrays.sort(arrd, new Comparator<int[]>() {
      @Override
      public int compare(int[] a, int[] b) {
        if(a[0] != b[0]){
          return a[0] - b[0];
        }
        if(a[0] % 2 != 0) {
          return -(a[1] - b[1]);
        }
        return a[1] - b[1];
      }
    });

    for (int i = 0; i < arrd.length; i++) {
      res[i] = arrd[i][2];
    }
    return res;
  }
}
