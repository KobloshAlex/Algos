package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfThree {

  public static void main(String[] args) {
    System.out.println(threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
  }

  public static List<List<Integer>> threeSum(int[] nums) {

    Arrays.sort(nums);
    List<List<Integer>> output = new ArrayList<>();

    for (int i = 0; i < nums.length - 2; i++) {
      if (i == 0 || nums[i] != nums[i - 1]) {
        int low = i + 1;
        int hight = nums.length - 1;
        int sum = -nums[i];

        while (low < hight) {
          if (nums[low] + nums[hight] == sum) {
            output.add(Arrays.asList(nums[i], nums[low], nums[hight]));
            while (low < hight && nums[low] == nums[low + 1]) {
              low++;
            }
            while (low < hight && nums[hight] == nums[hight - 1]) {
              hight--;
            }
            low++;
            hight--;
          } else if (nums[low] + nums[hight] > sum) {
            hight--;
          } else {
            low++;
          }
        }
      }
    }
    return output;
  }
}
