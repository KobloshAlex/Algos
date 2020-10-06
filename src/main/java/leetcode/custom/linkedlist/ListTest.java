package leetcode.custom.linkedlist;

public interface ListTest<T extends Comparable<T>> {

  Node<T> getMiddleNode();

  void insert(T data);

  void remove(T data);

  void traverse();

  int size();
}
