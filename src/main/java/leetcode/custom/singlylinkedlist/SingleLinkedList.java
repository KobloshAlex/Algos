package leetcode.custom.singlylinkedlist;

public class SingleLinkedList {
  private Node first;

  public SingleLinkedList() {}

  public boolean isEmpty() {
    return first == null;
  }

  // insert at the begining at the list

  public void insertFirst(int data) {
    Node node = new Node();
    node.data = data;
    node.next = first;
    first = node;
  }

  public Node deleteFirst() {
    Node tmp = first;
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

  public void insertLast(int data) {
    Node current = first;
    while (current.next != null) {
      current = current.next; // loop until current.next is null
    }
    Node node = new Node();
    node.data = data;
    current.next = node;
  }
}
