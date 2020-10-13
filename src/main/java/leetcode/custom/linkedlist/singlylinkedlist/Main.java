package leetcode.custom.linkedlist.singlylinkedlist;

public class Main {

  public static void main(String[] args) {
    SingleLinkedList list = new SingleLinkedList();
    list.insertFirst(12);
    list.insertFirst(13);
    list.insertFirst(15);

    list.insertLast(27);
    list.display();
  }
}
