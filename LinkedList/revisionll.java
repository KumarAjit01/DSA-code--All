package LinkedList;

public class revisionll {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        // insert the at the End
        void insertAtEnd(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }

            tail = temp;

        }

        // get the value of given indes!
        int getAt(int idx) {
            if (idx < 0 || idx > size()) {
                System.out.println("worng index !);");
                return -1;

            }
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;

            }
            return temp.data;
        }

        // insert At head
        void inserAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }

        }

        // display the node values!
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "-> ");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println();
        }

        // void elemnt at given index:-
        void insertaAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size()) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                inserAtHead(val);
                return;
            } else if (idx < 0) {
                System.out.println("wrong idx !");
                return;
            } else if (idx > size()) {
                System.out.print("wrong idx");
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        // the size are find
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;

        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);
        ll.insertAtEnd(9);
        ll.inserAtHead(5);
        ll.display();
        ll.insertaAt(3, 88);
        ll.display();

    }

}
