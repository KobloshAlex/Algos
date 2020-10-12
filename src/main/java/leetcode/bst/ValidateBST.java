package leetcode.bst;

public class ValidateBST {

  public static void main(String[] args) {
    //
  }

  public static final boolean validateBST(TreeNode node) {
    return helpValidateBst(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private static boolean helpValidateBst(TreeNode node, int minValue, int maxValue) {
    if (node.val < minValue || node.val >= maxValue) {
      return false;
    }
    if (node.left != null && !helpValidateBst(node.left, minValue, node.val)) {
      return false;
    }
    if (node.right != null && !helpValidateBst(node.right, node.val, maxValue)) {
      return false;
    }
    return true;
  }
}
