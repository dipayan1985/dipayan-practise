package dipayan.practise.datastructures;

public class Intersection {

  // Definition for singly-linked list.
  static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public static void main(String[] args) {
    // List A: 1 -> 3 -> 5 \
    //                         7 -> 9
    // List B:       2 -> 4 /

    // Create common intersection part
    ListNode intersect = new ListNode(7);
    intersect.next = new ListNode(9);

    // Create first list
    ListNode headA = new ListNode(1);
    headA.next = new ListNode(3);
    headA.next.next = new ListNode(5);
    headA.next.next.next = intersect; // connect to intersection

    // Create second list
    ListNode headB = new ListNode(2);
    headB.next = new ListNode(4);
    headB.next.next = intersect; // connect to same intersection

    // Test intersection method (currently returns null)
    ListNode intersectNode = getIntersectionNode(headA, headB);
    System.out.println(
        intersectNode != null ? "Intersection at: " + intersectNode.val : "No intersection");
  }

  // Method to find intersection (to be implemented)
  public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int len1 = 0;
    ListNode a = headA;

    while (a != null) {
      len1++;
      a = a.next;
    }

    int len2 = 0;
    ListNode b = headB;

    while (b != null) {
      len2++;
      b = b.next;
    }

    ListNode c = headA;
    ListNode d = headB;

    if (len1 > len2) {
      int diff = len1 - len2;

      while (diff > 0) {
        c = c.next;
        diff--;
      }
    } else {
      int diff = len2 - len1;

      while (diff > 0) {
        d = d.next;
        diff--;
      }
    }

    while (c != null && d != null) {
      if (c == d) {
        return c;
      }

      c = c.next;
      d = d.next;
    }

    return null;
  }
}
