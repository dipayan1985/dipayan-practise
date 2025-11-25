package dipayan.practise.datastructures;

public class DeleteNodeFromMiddleOfList {
    public static void main(String[] args) {
        // build the list: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // delete the middle node
        head = deleteMiddle(head);

        // print the modified list
        printList(head); // expected: 1 → 2 → 4 → 5
    }

    // Definition for singly-linked list node
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy;
        ListNode fast = dummy;
        int moves = 0;

        dummy.next = head;

        while (fast != null) {
            moves++;
            fast = fast.next;
        }

        int mid = moves / 2 - 1;

        int i = 0;

        while (i < mid) {
            slow = slow.next;
            i++;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" → ");
            current = current.next;
        }
        System.out.println();
    }
}

