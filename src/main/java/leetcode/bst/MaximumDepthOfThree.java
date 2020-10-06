package leetcode.bst;

public class MaximumDepthOfThree {

  public static void main(String[] args) {}

  public static final int howDeep(TreeNode treeNode) {

    if (treeNode == null) {
      return 0;
    }

    int left = howDeep(treeNode.left);
    int right = howDeep(treeNode);

    return Math.max(left, right);
  }
}
