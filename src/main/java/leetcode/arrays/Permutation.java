package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

  public static void main(String[] args) {
    System.out.println(permute(new int[] {1, 2, 3} ));
  }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        if (nums.length == 0) {
            return permutations;
        }

        collectPermutations(nums, 0, new ArrayList<>(), permutations);
        return permutations;
    }

    private static void collectPermutations(int[] nums, int start, List<Integer> permutation,
                                            List<List<Integer>> permutations) {

        if (permutation.size() == nums.length) {
            permutations.add(permutation);
            return;
        }

        for (int i = 0; i <= permutation.size(); i++) {
            List<Integer> newPermutation = new ArrayList<>(permutation);
            newPermutation.add(i, nums[start]);
            collectPermutations(nums, start + 1, newPermutation, permutations);
        }
    }
}
