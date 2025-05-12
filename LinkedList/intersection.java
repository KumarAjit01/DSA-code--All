package LinkedList;

import java.util.*;

//Find intersection of two linked lists
public class intersection {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static int findintersection(Node head1, Node head2) {
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
            int step = size1 - size2;
            for (int i = 1; i <= step; i++) {
                temp1 = temp1.next;
            }
        } else {
            int step = size2 - size1;
            for (int i = 1; i <= step; i++) {
                temp2 = temp2.next;
            }
        }
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1.data;

    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("Null\n");
    }

    public static void main(String args[]) {
        Node x = new Node(5);
        Node x1 = new Node(7);
        Node x2 = new Node(9);
        Node x3 = new Node(11);
        Node x4 = new Node(6);

        Node a = new Node(13);
        Node b = new Node(2);

        x.next = x1;
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;

        a.next = b;
        b.next = x3;
        display(x);
        display(a);
        System.out.println();
        System.out.println(findintersection(a, x));
    }

}
