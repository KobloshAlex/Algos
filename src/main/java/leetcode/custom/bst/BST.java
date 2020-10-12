package leetcode.custom.bst;

import java.util.Stack;

import static java.lang.Math.max;

public class BST {

  Node root;

  public void insert(Node node) {

    Node newNode = new Node(node.value);

    if (root == null) {
      root = newNode;
    } else {

      Node current = root;
      Node parent;

      while (true) {
        parent = current;
        if (node.value < current.value) {
          current = current.left;
          if (current == null) {
            parent.left = newNode;
            return;
          }
        } else {
          current = current.right;
          if (current == null) {
            parent.right = newNode;
            return;
          }
        }
      }
    }
  }

  public Node findMin() {
    Node current = root;
    Node last = null;

    while (current != null) {
      last = current;
      current = current.left;
    }

    return last;
  }

  public Node findMax() {
    Node current = root;
    Node last = null;

    while (current != null) {
      last = current;
      current = current.right;
    }
    return last;
  }

  public boolean delete(int key) {
    Node current = root;
    Node parent = root;

    boolean isLeftChild = false;

    // search to find the node with the key
    while (current.value != key) {
      parent = current;
      if (key < current.value) {
        current = current.left;
        isLeftChild = true;
      } else {
        current = current.right;
        isLeftChild = false;
      }
      // if not able to find
      if (current == null) {
        return false;
      }
    }
    // node was find
    Node nodeToDelete = current;

    // if node is a leaf
    if (nodeToDelete.right == null && nodeToDelete.left == null) {
      // if nodeToDelete is a root node
      if (nodeToDelete == root) {
        root = null;
      } else if (isLeftChild) {
        parent.left = null;
      } else {
        parent.right = null;
      }
      // if node has left child
    } else if (nodeToDelete.right == null) {
      if (nodeToDelete == root) {
        root = nodeToDelete.left;
      } else if (isLeftChild) {
        parent.left = nodeToDelete.left;
      } else {
        parent.right = nodeToDelete.left;
      }
    } // if node has left child
    else if (nodeToDelete.left == null) {
      if (nodeToDelete == root) {
        root = nodeToDelete.right;
      } else if (isLeftChild) {
        parent.left = nodeToDelete.right;
      } else {
        parent.right = nodeToDelete.right;
      }
    } // if node has two children
    else {

      Node successor = getSuccessor(nodeToDelete);

      // connect parent of nodeToDelete to successor;
      if (nodeToDelete == root) {
        root = successor;
      } else if (isLeftChild) {
        parent.left = successor;
      } else {
        parent.right = successor;
      }
      successor.left = nodeToDelete.left;
    }
    return true;
  }

  private Node getSuccessor(Node nodeToDelete) {

    Node successorParent = nodeToDelete;
    Node successor = nodeToDelete;

    Node current = nodeToDelete.right; // go to the right child one time

    while (current != null) { // going left of the tree until has no left nodes
      successorParent = successor;
      successor = current;
      current = current.left;
    }
    // if successor is not a right child
    if (successor != nodeToDelete.right) {
      successorParent.left = successor.right;
      successor.right = nodeToDelete.right;
    }

    return successor;
  }

  public void displayTree() {
    Stack globalStack = new Stack();
    globalStack.push(root);
    int nBlanks = 32;
    boolean isRowEmpty = false;
    System.out.println("......................................................");

    while (!isRowEmpty) {
      Stack localStack = new Stack();
      isRowEmpty = true;
      for (int j = 0; j < nBlanks; j++) {
        System.out.print(" ");
      }

      while (!globalStack.isEmpty()) {
        Node temp = (Node) globalStack.pop();
        if (temp != null) {
          System.out.print(temp.value);
          localStack.push(temp.left);
          localStack.push(temp.right);
          if (temp.left != null || temp.right != null) {
            isRowEmpty = false;
          }
        } else {
          System.out.print("--");
          localStack.push(null);
          localStack.push(null);
        }

        for (int j = 0; j < nBlanks * 2 - 2; j++) {
          System.out.print(" ");
        }
      }

      System.out.println();
      nBlanks = nBlanks / 2;

      while (!localStack.isEmpty()) globalStack.push(localStack.pop());
    }
    System.out.println("......................................................");
  }

  public int maxDepth(Node node) {
    if (node == null) {
      return 0;
    }
    int right = maxDepth(node.right);
    int left = maxDepth(node.left);

    return 1 + max(left, right);
  }

  public boolean isSymmetric(Node root) {
    if (root == null) {
      return false;
    }
    return checkSymmetric(root.left, root.right);
  }

  private boolean checkSymmetric(Node left, Node right) {
    if (left == null || right == null) {
      return left == right;
    }

    if (left.value != right.value) {
      return false;
    }

    return checkSymmetric(left.left, right.right) && checkSymmetric(left.right, right.left);
  }

  // TODO: 10/11/2020 fix
  public Node buildBST(int[] array) {
    if(array.length == 0) {
      return null;
    }
  return constructBST(array, 0, array.length - 1);
  }

  public Node constructBST(int[] array, int left, int right) {

    if(left > right) {
      return null;
    }
    int midPoint = left + (right - left) / 2;

    Node node = new Node(array[midPoint]);
    node.left = constructBST(array, left, midPoint - 1);
    node.right = constructBST(array, midPoint + 1  , right);

    return node;
  }

  @Override
  public String toString() {
    return "BST{" +
            "root=" + root +
            '}';
  }
}
