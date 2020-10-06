package algoexpert.doublylinkedlist;

public class Node<T> {
  private T value;
  private Node<T> next;
  private Node<T> prev;

  public Node(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public Node<T> setValue(T value) {
    this.value = value;
    return this;
  }

  public Node<T> getNext() {
    return next;
  }

  public Node<T> setNext(Node<T> next) {
    this.next = next;
    return this;
  }

  public Node<T> getPrev() {
    return prev;
  }

  public Node<T> setPrev(Node<T> prev) {
    this.prev = prev;
    return this;
  }
}
