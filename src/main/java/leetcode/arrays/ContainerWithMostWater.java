package leetcode.arrays;

public class ContainerWithMostWater {

  public static void main(String[] args) {
    //
    System.out.println(getMaxValue(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
    System.out.println(getMaxValueOptimal(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
  }

  public static final int getMaxValue(int[] height) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < height.length; i++) {
      for (int j = i + 1; j < height.length; j++) {
        int min = Math.min(height[i], height[j]);
        max = Math.max(max, min * (j - i));
      }
    }
    return max;
  }

  public static final int getMaxValueOptimal(int[] height) {
    int max = Integer.MIN_VALUE;
    int i = 0;
    int j = height.length - 1;
    while (i < j) {
      int min = Math.min(height[i], height[j]);
      max = Math.max(max, min * (j - i));
      if(height[i] < height[j]) {
        i++;
      }else {
        j--;
      }
    }
    return max;
  }
}
