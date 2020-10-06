package leetcode.custom.linkedlist;

public class Main {

  public static void main(String[] args) {
    ListTest<Integer> list = new LinkedListTestTest<>();
    list.insert(10);
    list.insert(25);
    list.insert(35);
    list.insert(100);
    list.insert(150);

    System.out.println(list.getMiddleNode());
  }
}
