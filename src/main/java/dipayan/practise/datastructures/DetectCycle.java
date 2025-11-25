package dipayan.practise.datastructures;

public class DetectCycle {
    static class ListNode {
        int value;
        ListNode next;

        ListNode() {

        }

        ListNode(int value) {
            this.value = value;
        }

        ListNode(int val, ListNode next) {
            this.value = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }

    private void detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                System.out.println("Cycle found");
                break;
            }
        }
    }
}
