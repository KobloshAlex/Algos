package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class HowManyDublicates {

  public static void main(String[] args) {
    System.out.println(calculate(new int[] {1, 3, 1, 2, 5, 4, 3, 1}));
  }

  public static final Map<Integer, Integer> calculate(int[] nums) {

    Map<Integer, Integer> map = new HashMap<>();

    //    for (int num : nums) {
    //      if(!map.containsKey(num)) {
    //        map.put(num, 1);
    //      } else {
    //        map.put(num, map.get(num) + 1);
    //      }
    //    }

    for (int i = 0; i < nums.length; i++) {
      if (!map.containsKey(nums[i])) {
        map.put(nums[i], 1);
      } else {
        map.put(nums[i], nums[i] + 1);
      }
    }

    return map;
  }
}
