package LinkedList;

//Find nth Node from the end of LinkedList;
public class find_nth_node {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int findnthterm(Node head, int n) {
        Node temp = head;
        int size = 0;
        // size find
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        // find term
        int m = size - n + 1;
        temp = head;
        // find term data
        for (int i = 1; i <= m - 1; i++) {
            temp = temp.next;
        }
        return temp.data;

    }

    // another method
    public static int findnthterm2(Node head, int n) {
        Node fast = head;
        Node slow = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;
    }

    public static int find(Node head, int n) {
        Node fast = head;
        Node slow = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;

    }

    public static void main(String args[]) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(find(a, 4));
    }
}
