package algoexpert;

import static java.lang.Math.abs;

public class FindClosestInBST {
  public static int findClosestValueInBst(BST tree, int target) {
    // Write your code here.

    return findClosestValue(tree, target, tree.value);
  }

  public static int findClosestValue(BST tree, int target, int closest) {
    BST currentNode = tree;
    while (currentNode != null) {
      if (abs(target - closest) > abs(target - tree.value)) {
        closest = currentNode.value;
      }
      if (target < currentNode.value) {
        currentNode = tree.right;
      }
      if (target > currentNode.value) {
        currentNode = tree.left;
      } else {
        break;
      }
    }
    return closest;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
