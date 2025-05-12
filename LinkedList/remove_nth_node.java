package LinkedList;

//Removing nth Node from the end of LinkedList
public class remove_nth_node {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void findnthterm(Node head, int n) {

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null\n");
        System.out.println("------after deletion of data-----------");
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
        for (int i = 1; i <= m - 2; i++) {
            temp = temp.next;
        }

        // delete the nth node;
        temp.next = temp.next.next;

        // printing node data we again assign the temp to head
        temp = head;

        // printing node after delete
        while (temp != null) {

            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");

    }

    public static void findnthterm2(Node head, int n) {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n;
        temp = head;
        for (int i = 1; i < m - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    // another method two pointer approach
    public static void findnthterm3(Node head, int n) {
        Node first = head;
        Node slow = head;
        for (int i = 1; i <= n; i++) {
            first = first.next;
        }
        while (first.next != null) {
            first = first.next;
            slow = slow.next;

        }
        slow.next = slow.next.next;
        slow = head;
        while (slow != null) {
            System.out.print(slow.data + " ");
            slow = slow.next;
        }

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
        findnthterm3(a, 3);
    }

}
