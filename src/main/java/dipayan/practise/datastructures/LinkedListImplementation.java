package dipayan.practise.datastructures;

public class LinkedListImplementation {
    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    static class LinkedList {
        Node head;

        public void insert(int data) {
            Node newNode = new Node(data, null);

            if (head == null) {
                head = newNode;

                return;
            }

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        public void display() {
            Node temp = head;

            while (temp.next != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }

            System.out.println(temp.data);
        }

        public void delete(int key) {
            if (head == null) {
                return;
            }

            if (head.data == key) {
                head = head.next;
                return;
            }

            Node temp = head;

            while (temp.next != null && temp.next.data != key) {
                temp = temp.next;
            }

            if (temp.next != null) {
                temp.next = temp.next.next;
            } else {
                System.out.println("not found");
            }
        }
    }

    // Test the linked list
    public static class LinkedListDemo {
        public static void main(String[] args) {
            LinkedList list = new LinkedList();

            list.insert(10);
            list.insert(20);
            list.insert(30);

            list.display(); // 10 -> 20 -> 30 -> null

            list.delete(20);
            list.display(); // 10 -> 30 -> null
        }
    }
}
