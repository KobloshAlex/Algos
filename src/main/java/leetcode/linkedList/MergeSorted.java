package leetcode.linkedList;

class ListNode {
  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

public class MergeSorted {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode tempNode = new ListNode(0);
    ListNode curr = tempNode;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        curr.next = l1;
        l1 = l1.next;
      } else {
        curr.next = l2;
        l2 = l2.next;
      }
      curr = curr.next;
    }
    // if we get to the end of one list

    if (l1 != null) {
      curr.next = l1;
    }
    if (l2 != null) {
      curr.next = l2;
    }
    return tempNode.next;
  }
}
