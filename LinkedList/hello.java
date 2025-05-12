package LinkedList;

public class hello {
    public static int display(Node a) {
        // Node temp = head;
        int dis = 0;
        while (a != null) {
            System.out.print(a.data + " ");
            a = a.next;
            dis++;
        }
        System.out.println();
        return dis;
    }

    // print the node using recursion fuction
    public static void displayr(Node head) {
        if (head == null) {
            return;

        }
        displayr(head.next);

        System.out.print(head.data + " ");

    }

    // here user define data type
    // own class create by user
    public static class Node {
        int data;// value
        Node next;// address

        Node(int data) {
            this.data = data;

        }
    }

    public static void main(String args[]) {
        // create object of Node class
        // and assigen value
        Node a = new Node(5);

        Node b = new Node(11);
        Node c = new Node(2);
        Node d = new Node(6);
        Node e = new Node(9);
        // connect each node
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("total number of node are: " + display(a));
        // displayr(a);

    }

}
