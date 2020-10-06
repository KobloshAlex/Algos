package leetcode.bst;

public class ArrayToBinaryTree {

  /*   Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

     For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
  */

  public static void main(String[] args) {}

  public TreeNode sortedArrayToBST(int[] nums) {
    if (nums.length == 0) {
      return null;
    }

    return converArrayToBinaryTree(nums, 0, nums.length - 1);
  }

  private TreeNode converArrayToBinaryTree(int[] nums, int left, int right) {

    if (left > right) return null;
    int mid = left + (right - left) / 2;

    TreeNode node = new TreeNode(nums[mid]);
    node.left = converArrayToBinaryTree(nums, left, mid - 1);
    node.right = converArrayToBinaryTree(nums, mid + 1, right);

    return node;
  }
}
