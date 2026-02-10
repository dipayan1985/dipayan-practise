package dipayan.practise.datastructures;

public class PalindromeLinkedList {

  // Definition for singly-linked list.
  static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {
    // Example list: 1 -> 2 -> 2 -> 1
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(1);

    boolean result = isPalindrome(head);

    System.out.println("Is Palindrome? " + result);
  }

  // 🔵 Implement your logic here
  public static boolean isPalindrome(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    ListNode reversing = slow.next;
    ListNode prev = null;

    while (reversing != null) {
      ListNode next = reversing.next;

      reversing.next = prev;
      prev = reversing;

      reversing = next;
    }

    return false;
  }

  // Helper to print a linked list if you need it later
  public static void printList(ListNode head) {
    while (head != null) {
      System.out.print(head.val);
      if (head.next != null) System.out.print(" -> ");
      head = head.next;
    }
    System.out.println();
  }
}
