package LinkedList;

public class doublyll {
    public static class Node {
        int data;
        Node next;
        Node previous;

        Node(int data) {
            this.data = data;
        }
    }

    public static void disply(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void disply2(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.previous;
        }
    }

    public static void main(String args[]) {
        Node a = new Node(10);
        Node b = new Node(15);
        Node c = new Node(20);
        Node d = new Node(14);
        Node e = new Node(80);
        a.next = b;
        a.previous = null;
        b.next = c;
        b.previous = a;
        c.next = d;
        c.previous = b;
        d.previous = c;
        d.next = e;
        e.next = null;
        e.previous = d;
        disply(a);
        disply2(e);
    }

}
