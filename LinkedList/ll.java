package LinkedList;

public class ll {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head = null;

    public static void deleteNode(int data) {
        Node temp = head;
        for (int i = 0; i < data - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node x = new Node(5);
        Node x1 = new Node(7);
        Node x2 = new Node(9);
        Node x3 = new Node(11);
        Node x4 = new Node(6);

        x.next = x1;
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        display(x);
        deleteNode(3);
        display(x);
    }

}
