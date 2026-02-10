package dipayan.practise.datastructures;

class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = new ListNode();
    ListNode head = result;
    int carry = 0; // carry persists across iterations

    while (l1 != null || l2 != null || carry != 0) {
      int value = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
      int sum = value + carry;

      result.val = sum % 10;
      carry = sum / 10;

      if ((l1 != null && l1.next != null) || (l2 != null && l2.next != null) || carry != 0) {
        result.next = new ListNode();
        result = result.next;
      }

      if (l1 != null) {
        l1 = l1.next;
      }

      if (l2 != null) {
        l2 = l2.next;
      }
    }

    return head;
  }

  public static void main(String[] args) {
    // l1 = [9,9,9,9,9,9,9]
    ListNode l1 = new ListNode(9);
    l1.next = new ListNode(9);
    l1.next.next = new ListNode(9);
    l1.next.next.next = new ListNode(9);
    l1.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next.next = new ListNode(9);

    // l2 = [9,9,9,9]
    ListNode l2 = new ListNode(9);
    l2.next = new ListNode(9);
    l2.next.next = new ListNode(9);
    l2.next.next.next = new ListNode(9);

    AddTwoNumbers solution = new AddTwoNumbers();
    ListNode result = solution.addTwoNumbers(l1, l2);

    printList(result);
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
}
