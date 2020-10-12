package leetcode.custom.bst;

class Node {
  int value;
  Node left;
  Node right;

  public Node() {
  }

  public Node(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Node{" +
            "value=" + value +
            '}';
  }
}
