package algoexpert.doublylinkedlist;

public interface IDoublyLinkedList<T> {

  void sedHead(Node<T> node);

  void setTail(Node<T> node);

  void insertBefore(Node<T> node, Node<T> nodeToInsert);

  void insertAfter(Node<T> node, Node<T> nodeToInsert);

  void insertAtPosition(T position, Node<T> nodeToInsert);

  void removeNodesWithValue(T value);

  void remove(Node<T> node);

  boolean containsNodeWithValue(T value);
}
