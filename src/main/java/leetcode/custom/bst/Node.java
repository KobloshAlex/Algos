package leetcode.custom.bst;

class Node {
  int key;
  String value;
  Node left;
  Node right;

  public Node(int key, String value) {
    this.key = key;
    this.value = value;
    this.left = null;
    this.right = null;
  }

  @Override
  public String toString() {
    return "Node{" + "key=" + key + ", value='" + value + '\'' + '}';
  }
}
