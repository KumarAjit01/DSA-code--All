package LinkedList;

public class simplell {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        System.out.println();
    }

    public static int displaycount(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;
    }

    public static void main(String[] args) {
        Node x1 = new Node(5);
        Node x2 = new Node(7);
        Node x3 = new Node(9);
        Node x4 = new Node(35);
        Node x5 = new Node(11);
        // linked data
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;

        display(x1);
        System.out.println(displaycount(x1));

    }

}
