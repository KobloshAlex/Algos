package leetcode.bst;

public class InvertBinaryTree {
  public static void main(String[] args) {
    //
  }

  private static TreeNode invert(TreeNode root) {
      if(root == null) {
          return root;
      }

      TreeNode right = invert(root.right);
      TreeNode left = invert(root.left);

      root.right = left;
      root.left = right;
      return root;
  }
}
