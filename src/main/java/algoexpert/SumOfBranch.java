package algoexpert;

import java.util.ArrayList;
import java.util.List;

public class SumOfBranch {
  public static List<Integer> branchSums(BinaryTree root) {
    // Write your code here.
    List<Integer> sums = new ArrayList<>();
    calculateBranchSums(root, 0, sums);
    return sums;
  }

  private static void calculateBranchSums(BinaryTree node, int runningSums, List<Integer> sums) {

    if (node == null) {
      return;
    }

    int newRunningSums = runningSums + node.value;
    if (node.left == null && node.right == null) {
      sums.add(newRunningSums);
      return;
    }

    calculateBranchSums(node.left, newRunningSums, sums);
    calculateBranchSums(node.right, newRunningSums, sums);
  }

  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }
}
