package leetcode.custom.bst;

import java.util.Stack;

public class BST {

  private Node root;

  public void insert(int key, String value) {

    Node newNode = new Node(key, value);

    if (root == null) {
      root = newNode;
    } else {

      Node current = root;
      Node parent;

      while (true) {
        parent = current;
        if (key < current.key) {
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
    while (current.key != key) {
      parent = current;
      if (key < current.key) {
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
    } //if node has two children
    else {

      Node successor = getSuccessor(nodeToDelete);

      //connect parent of nodeToDelete to successor;
      if(nodeToDelete == root) {
        root = successor;
      } else if(isLeftChild) {
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

    while (current != null) { //going left of the tree until has no left nodes
      successorParent = successor;
      successor = current;
      current = current.left;
    }
    //if successor is not a right child
    if(successor != nodeToDelete.right) {
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

    while(!isRowEmpty) {
      Stack localStack = new Stack();
      isRowEmpty = true;
      for(int j=0; j<nBlanks; j++) {
        System.out.print(" ");
      }

      while(!globalStack.isEmpty()) {
        Node temp = (Node)globalStack.pop();
        if(temp != null) {
          System.out.print(temp.key);
          localStack.push(temp.left);
          localStack.push(temp.right);
          if(temp.left != null || temp.right != null) {
            isRowEmpty = false;
          }
        } else {
          System.out.print("--");
          localStack.push(null);
          localStack.push(null);
        }

        for(int j=0; j<nBlanks*2-2; j++) {
          System.out.print(" ");
        }
      }

      System.out.println();
      nBlanks = nBlanks/2;

      while(!localStack.isEmpty())
        globalStack.push( localStack.pop() );
    }
    System.out.println( "......................................................");

  }
}
