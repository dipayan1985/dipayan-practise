package dipayan.practise.datastructures;

public class RemoveKthElementFromLinkedList {
  public static void main(String[] args) {
    // Build linked list: 1 -> 2 -> 3 -> 4 -> 5
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    RemoveKthElementFromLinkedList solution = new RemoveKthElementFromLinkedList();

    // Remove 2nd node from the end (expect: 1 -> 2 -> 3 -> 5)
    ListNode result = solution.removeNthFromEnd(head, 5);

    printList(result);
  }

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0, head);
    ListNode fast = dummy;
    ListNode slow = dummy;

    for (int i = 0; i <= n; i++) {
      fast = fast.next;
    }

    while (fast != null) {
      fast = fast.next;
      slow = slow.next;
    }

    slow.next = slow.next.next;

    return dummy.next;
  }

  private static void printList(ListNode node) {
    while (node != null) {
      System.out.print(node.val);

      if (node.next != null) {
        System.out.print(" -> ");
      }

      node = node.next;
    }

    System.out.println();
  }

  public static class ListNode {
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
}
