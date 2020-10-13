package leetcode.linkedList;

import java.util.Stack;

public class ReverseLinkedList {
  public static void main(String[] args) {
    //
  }

  public static ListNode reverseList(ListNode head) {
      /* iterative solution */
    Stack<ListNode> stack = new Stack<>();
    while (head != null) {
      stack.push(head);
      head = head.next;
    }
    ListNode dummy = new ListNode(-1); // just -1
    head = dummy;
    while (!stack.isEmpty()) {
      ListNode current = stack.pop();
      head.next = new ListNode(current.val);
      head = head.next;
    }
    return dummy.next;
  }

  public ListNode reverseListRec(ListNode head) {
    /* recursive solution */
    return reverseListInt(head, null);
  }

  private ListNode reverseListInt(ListNode head, ListNode newHead) {
    if (head == null) return newHead;
    ListNode next = head.next;
    head.next = newHead;
    return reverseListInt(next, head);
  }
}
