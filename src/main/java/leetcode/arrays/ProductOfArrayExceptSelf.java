package leetcode.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
  public static void main(String[] args) {
    //
    System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3})));
    System.out.println(Arrays.toString(productExceptSelf1(new int[]{1, 2, 3})));
  }

    public static final int[] productExceptSelf1(int[] nums) {

      int product = 0;
      int[] result = new int[3];
    for (int i = 0; i < nums.length; i++) {
      //
        product = product * nums[i];
    }
    System.out.println(product);
    for (int i = 0; i < nums.length; i++) {
        result[i] = product / nums[i];
    }
    return result;
    }

  public static final int[] productExceptSelf(int[] nums) {
      // Left is an array containing the left products
      // i.e: left[i] = nums[0] * .... * nums[i-1]  * nums[i]
      int[] left = new int[nums.length];

      // Right is an array containing the array products
      //i.e: right[i] = nums[i] * nums[i+1]  * .... * nums[len(nums)]
      int[] right = new int[nums.length];

      left[0] = 1;
      for (int i = 1; i < nums.length; i++) {
          left[i] = left[i-1] * nums[i-1];
      }

      right[nums.length - 1] = 1;
      for (int i = nums.length - 2; i >= 0; i--) {
          right[i] = right[i+1] * nums[i+1];
      }

      int[] product = new int[nums.length];
      for (int i = 0; i < product.length; i++) {
          product[i] = left[i] * right[i];
      }

      return product;
  }
}
