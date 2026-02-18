public class RemoveLast {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;
    static int size = 0;

    // Add Last (helper method)
    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Remove Last
    public static int removeLast() {

        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        } 
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // Find second last node (index = size - 2)
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;   // tail data
        prev.next = null;           // remove link
        tail = prev;                // update tail
        size--;

        return val;
    }

    // Print Linked List
    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);

        print();

        System.out.println("Removed: " + removeLast());

        print();
    }
}