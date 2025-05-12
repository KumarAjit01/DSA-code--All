package LinkedList;
//1->2->3->6->7

//4->5->6->7

public class intersectionapn {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int findSection(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        int size1 = 0;
        int size2 = 0;
        while (temp1 != null) {
            size1++;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            size2++;
            temp2 = temp2.next;
        }
        temp1 = head1;
        temp2 = head2;

        if (size1 > size2) {
            int s = size1 - size2;
            for (int i = 0; i < s; i++) {
                temp1 = temp1.next;
            }
        } else {
            int s = size2 - size1;
            for (int i = 0; i < s; i++) {
                temp2 = temp2.next;

            }

        }

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1.data;

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(6);
        Node e = new Node(7);

        Node x1 = new Node(4);
        Node x2 = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        x1.next = x2;
        x2.next = c;
        System.out.println(findSection(a, x1));
    }

}
