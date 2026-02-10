package dipayan.practise.datastructures;

public class RemoveElements {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // Example list: 6 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(6);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int val = 6; // value to remove

        ListNode result = removeElements(head, val);

        // print result
        printList(result);
    }

    // 🔵 Implement logic here
    public static ListNode removeElements(ListNode head, int val) {
        // your logic
        ListNode first = new ListNode(-1);

        first.next = head;

        ListNode dummy = first;

        while (dummy.next != null) {
            if (dummy.next.val == val) {
                dummy.next = dummy.next.next;
            } else {
                dummy = dummy.next;
            }
        }

        return first.next;
    }

    // Helper to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}
