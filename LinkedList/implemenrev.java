package LinkedList;

public class implemenrev {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        // insert At end
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;

        }
        // insert At head

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                insertAtEnd(val);
                return;
            } else {
                temp.next = head;
                head = temp;
                size++;
            }
        }

        // insert at given idx
        void insertAti(int idx, int val) {
            Node temp = head;
            Node t = new Node(val);
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        // display idx data
        int getdata(int idx) {
            Node temp = head;
            if (idx >= size || idx < 0) {
                System.out.println("wrong idx");
                return -1;
            }
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void delete(int idx) {
            Node temp = head;
            if (idx > size || idx < 0) {
                System.out.println("wrong idx");
                return;
            }
            for (int i = 1; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        // display
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println();
        }

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(1);
        ll.insertAtHead(2);
        ll.insertAtEnd(9);
        ll.insertAtEnd(3);
        ll.insertAtHead(7);
        ll.display();
        System.out.println(ll.size);
        ll.delete(3);
        ll.display();
        System.out.println(ll.size);
        ll.insertAti(3, 76);
        ll.display();

    }

}
