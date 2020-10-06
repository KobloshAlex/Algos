package algoexpert.doublylinkedlist;

public class DoublyLinkedList<T extends Comparable<T>> implements IDoublyLinkedList<T> {

  private Node<T> head;
  private Node<T> tail;

  @Override
  public void sedHead(Node<T> node) {}

  @Override
  public void setTail(Node<T> node) {}

  @Override
  public void insertBefore(Node<T> node, Node<T> nodeToInsert) {}

  @Override
  public void insertAfter(Node<T> node, Node<T> nodeToInsert) {}

  @Override
  public void insertAtPosition(T position, Node<T> nodeToInsert) {}

  @Override
  public void removeNodesWithValue(T value) {}

  @Override
  public void remove(Node<T> node) {
    if (node == head) {
      head = node.getNext();
    }
    if (node == tail) {
      tail = node.getPrev();
    }

    // if (node.getPrev() != null) node.getPrev().getNext() = node.getPrev();

  }

  @Override
  public boolean containsNodeWithValue(T value) {
    Node<T> node = head;
    while (node != null && node.getValue() != value) {
      node = node.getNext();
    }
    return node != null;
  }
}
