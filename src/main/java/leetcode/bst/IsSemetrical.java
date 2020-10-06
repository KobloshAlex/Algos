package leetcode.bst;

public class IsSemetrical {
  public static void main(String[] args) {}

  public static final boolean isSemmetric(TreeNode root) {

    if (root == null) {
      return true;
    }

    return isSemmetric(root.left, root.right);
  }

  private static boolean isSemmetric(TreeNode left, TreeNode right) {

    if (left == null || right == null) {
      return left == right;
    }

    if (left.val != right.val) {
      return false;
    }

    return isSemmetric(left.left, right.right) && isSemmetric(left.right, right.left);
  }
}
