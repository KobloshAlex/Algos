package leetcode.arrays;

public class LargestNumberInArrayBiggerTwice {
  public static void main(String[] args) {
    System.out.println(findLargest(new int[] {3, 6, 2, 1}));
    //
  }

  public static final int findLargest(int[] nums) {

    int maxIndex = 0;
    int length = nums.length;
    //get the index of biggest number in array
    for (int i = 0; i < length; i++) {
      if (nums[i] > nums[maxIndex]) {
        maxIndex = i;
      }
    }
    //check if biggest number in array
    // is twice bigger then all num[i]
    for (int i = 0; i < length; i++) {
      if (maxIndex != i && nums[maxIndex] < (nums[i] * 2)) {
        return -1;
      }
    }
    return maxIndex;
  }
}
