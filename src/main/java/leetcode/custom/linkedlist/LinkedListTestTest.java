package leetcode.custom.linkedlist;

public class LinkedListTestTest<T extends Comparable<T>> implements ListTest<T> {

  private Node<T> root;
  private int size;

  @Override
  public Node<T> getMiddleNode() {
    Node<T> fastPointer = this.root;
    Node<T> slowPointer = this.root;
    while (fastPointer.getNextNode() != null && fastPointer.getNextNode().getNextNode() != null) {
      fastPointer = fastPointer.getNextNode().getNextNode();
      slowPointer = slowPointer.getNextNode();
    }
    return slowPointer;
  }

  @Override
  public void insert(T data) {
    this.size++;

    if (root == null) {
      this.root = new Node<>(data);
    } else {
      insertDataIntoBeginning(data);
    }
  }

  private void insertDataIntoBeginning(T data) {
    Node<T> newNode = new Node<>(data);
    newNode.setNextNode(root);
    this.root = newNode;
  }

  private void insertEnd(T data, Node<T> node) {
    if (node.getNextNode() != null) {
      insertEnd(data, node.getNextNode());
    } else {
      Node<T> newNode = new Node<>(data);
      node.setNextNode(newNode);
    }
  }

  @Override
  public void remove(T data) {

    if (this.root == null) {
      return;
    }
    this.size--;

    if (this.root.getData().compareTo(data) == 0) {
      this.root = this.root.getNextNode();
    } else {
      remove(data, root, root.getNextNode());
    }
  }

  private void remove(T dataToRemove, Node<T> previousNode, Node<T> actualNode) {

    while (actualNode != null) {
      if (actualNode.getData().compareTo(dataToRemove) == 0) {
        previousNode.setNextNode(actualNode.getNextNode());
        actualNode = null;
        return;
      }
      previousNode = actualNode;
      actualNode = actualNode.getNextNode();
    }
  }

  @Override
  public void traverse() {

    if (this.root == null) {
      return;
    }

    Node<T> actualNode = this.root;

    while (actualNode != null) {
      System.out.println(actualNode + " - ");
      actualNode = actualNode.getNextNode();
    }
  }

  @Override
  public int size() {
    return this.size;
  }
}
