package algoexpert.doublylinkedlist;

public class AlgoLinkedList<T> {
  static class DoublyLinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    public void setHead(Node node) {
      // Write your code here.
    }

    public void setTail(Node node) {
      // Write your code here.
    }

    public void insertBefore(Node node, Node nodeToInsert) {
      // Write your code here.
    }

    public void insertAfter(Node node, Node nodeToInsert) {
      // Write your code here.
    }

    public void insertAtPosition(int position, Node nodeToInsert) {
      // Write your code here.
    }

    public void removeNodesWithValue(int value) {
      // Write your code here.
    }

    public void remove(Node node) {
      // Write your code here.
    }

    public boolean containsNodeWithValue(int value) {
      // Write your code here.
      Node<T> node = head;
      while (node != null && node.value != value) {
        node = node.next;
      }
      return node != null;
    }
  }

  // Do not edit the class below.
  static class Node<T> {
    public int value;
    public Node<T> prev;
    public Node<T> next;

    public Node(int value) {
      this.value = value;
    }
  }
}
