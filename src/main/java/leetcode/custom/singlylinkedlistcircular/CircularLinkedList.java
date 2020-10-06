package leetcode.custom.singlylinkedlistcircular;

public class CircularLinkedList {
  private Node first;
  private Node last;

  public CircularLinkedList() {
    this.first = null;
    this.last = null;
  }

  public void insertFisrt(int data) {
    Node node = new Node();
    node.data = data;

    if (isEmpty()) {
      last = node;
    }
    node.next = first; // newNode -> old first
    first = node;
  }

  private boolean isEmpty() {
    return first == null;
  }

  public void insertLast(int data) {
    Node newNode = new Node();
    if (isEmpty()) {
      first = newNode;
    } else {
      last.next = newNode;
      last = newNode;
    }
  }

  public int deleteFisrt() {
    int tmp = first.data;
    if (first.next == null) {
      last = null;
    }
    first = first.next;
    return tmp;
  }

  public void display() {
    System.out.println("List(first -> last)");
    Node current = first;
    while (current != null) {
      current.displayNode();
      current = current.next;
    }
  }
}
