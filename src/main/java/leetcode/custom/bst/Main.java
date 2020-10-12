package leetcode.custom.bst;

public class Main {
  public static void main(String[] args) {
    //

    Node node = new Node(20);
    Node node1 = new Node(10);
    Node node2 = new Node(30);
    Node node3 = new Node(40);

    BST bst = new BST();
    BST bst1 = new BST();

    bst1.insert(node);
    bst1.insert(node1);
    bst1.insert(node2);
    bst1.insert(node3);

    bst.root = new Node(20);
    bst.root.left = new Node(10);
    bst.root.right = new Node(30);
    bst.root.right.right = new Node(40);

//
//    System.out.println(bst.findMin());
//    System.out.println(bst.findMax());
//
//    bst.displayTree();
//    System.out.println(bst1.maxDepth(bst.root));

   /* //symmetric
    BST symmetric = new BST();
    symmetric.root = new Node(1);
    symmetric.root.left = new Node(2);
    symmetric.root.right = new Node(2);
    symmetric.root.left.right = new Node(3);
    symmetric.root.left.left = new Node(3);
    symmetric.root.right.left = new Node(3);
    symmetric.root.right.right = new Node(3);

    symmetric.displayTree();

    System.out.println(symmetric.isSymmetric(symmetric.root));*/

    BST fromArray = new BST();
    int[] array = new int[] {4, 2, 1, 3, 6, 5, 7};
    fromArray.constructBST(array, 0, array.length - 1);
    System.out.println(fromArray);
    fromArray.displayTree();
  }
}
