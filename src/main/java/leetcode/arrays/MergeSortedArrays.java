package leetcode.arrays;

import java.util.Arrays;

public class MergeSortedArrays {
  public static void main(String[] args) {

    System.out.println(
        Arrays.toString(
            doCalc(
                new int[] {1, 2, 5, 0, 0, 0},
                3,
                new int[] {
                  3, 4, 6,
                },
                3)));
  }

  public static final int[] doCalc(int[] a1, int n, int[] a2, int m) {

    for (int i = 0; i < n; i++) {
      a1[i + m] = a2[i];
    }
    Arrays.sort(a1);
    return a1;
  }

  public void merge(int[] nums1, int m, int[] nums2, int n) {

    int lastIndex = nums1.length - 1;
    int mIndex = m - 1;
    int nIndex = n - 1;

    while (nIndex >= 0) {
      if (mIndex >= 0 && nums1[mIndex] > nums2[nIndex]) {
        nums1[lastIndex] = nums1[mIndex];
        mIndex--;
      } else {
        nums1[lastIndex] = nums2[nIndex];
        nIndex--;
      }
      lastIndex--;
    }
  }
}
