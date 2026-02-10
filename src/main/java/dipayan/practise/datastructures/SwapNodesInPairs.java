package dipayan.practise.datastructures;

public class SwapNodesInPairs {
  static class ListNode {
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

  public static void main(String[] args) {
    // Example: create list 1 -> 2 -> 3 -> 4
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);

    // Call the swap function
    ListNode newHead = swapPairs(head);

    // Print result: should be 2 -> 1 -> 4 -> 3
    printList(newHead);
  }

  public static ListNode swapPairs(ListNode head) {
    if (head == null) {
      return null;
    }

    if (head.next == null) {
      return head;
    }

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = dummy;

    // 1,2,3,4
    while (prev.next != null && prev.next.next != null) {
      ListNode first = prev.next; // 1
      ListNode second = prev.next.next; // 2

      first.next = second.next; // 1->3
      second.next = first; // 2->1
      prev.next = second; // 0->2

      prev = first; // ->
    }

    return dummy.next;
  }

  public static void printList(ListNode head) {
    while (head != null) {
      System.out.print(head.val);
      if (head.next != null) System.out.print(" -> ");
      head = head.next;
    }

    System.out.println();
  }
}
