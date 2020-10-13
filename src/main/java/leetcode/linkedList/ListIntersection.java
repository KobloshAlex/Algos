package leetcode.linkedList;

import java.util.HashSet;
import java.util.Set;

public class ListIntersection {
  public static void main(String[] args) {
    //

  }

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    Set<ListNode> visited = new HashSet<>();

    while (headA != null) {
      visited.add(headA);
      headA = headA.next;
    }

    while (headB != null) {
      if (visited.contains(headB)) {
        return headB;
      }
      headB = headB.next;
    }
    return null;
  }
}
