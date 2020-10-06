package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
  public static void main(String[] args) {
    System.out.println(doCalc(new int[] {4, 1, 2, 1, 2}));
  }

  public static final int doCalc(int[] nums) {

    Map<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
      if (!map.containsKey(num)) {
        map.put(num, 1);
      } else {
        map.put(num, map.get(num) + 1);
      }
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1) {
        return entry.getKey();
      }
    }
    return -1;
  }

  public int singleNumber(int[] nums) {
    int xor = 0;
    for (int i = 0; i < nums.length; i++) xor ^= nums[i];
    return xor;
  }
}
