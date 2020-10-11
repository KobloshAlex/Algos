package leetcode.custom.bst;

public class Main {
  public static void main(String[] args) {
    //

    BST bst = new BST();

    bst.insert(20, "two");
    bst.insert(10, "one");
    bst.insert(5, "one");
    bst.insert(15, "one");
    bst.insert(30, "three");
    bst.insert(25, "three");
    bst.insert(40, "four");
    bst.insert(50, "four");

    System.out.println(bst.findMin());
    System.out.println(bst.findMax());

    bst.delete(30);

    bst.displayTree();
  }
}
