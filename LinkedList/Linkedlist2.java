package LinkedList;

public class Linkedlist2 {
    // ----------------------:create own
    // data:---------------------------------------

    public static class Node {
        int data;
        Node Next;

        public Node(int data) {
            this.data = data;
            this.Next = null;
        }
    }

    // ----------------------------:create--->head
    // tail:-----------------------------

    public static Node Head;
    public static Node tail;
    public static int size;

    // ----------------------- ----:Add the first in:---------------------

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (Head == null) {
            Head = tail = newNode;

            return;
        }
        newNode.Next = Head;
        Head = newNode;

    }

    //------------ Reverse the ll---------
    public void reverse() {
        Node prev = null;
        Node curr = tail = Head;
        Node next;
        while (curr != null) {
            next = curr.Next;
            curr.Next = prev;
            prev = curr;
            curr = next;
        }
        Head = prev;
    }
    // -----------------------------:Add the Last in:---------------------------

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            addFirst(data);
            return;
        }
        tail.Next = newNode;
        tail = newNode;
        size++;

    }

    // ------------add at Given idx:--------------
    void add(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = Head;
        int i = 0;
        if (idx == 0) {
            addFirst(data);
            return;
        }
        while (i < idx - 1) {
            temp = temp.Next;
            i++;

        }
        newNode.Next = temp.Next;
        temp.Next = newNode;
        size++;
    }

    // -----------Remove First:----------------
    int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty");
        } else if (size == 1) {
            int val = Head.data;
            Head = tail = null;
            size = 0;
            return val;
        }

        int val = Head.data;
        Head = Head.Next;
        size--;
        return val;
    }

    // search key in linkedlist
    public int findKey(int key) {
        Node temp = Head;
        int i = 0;
        while (temp != null) {

            if (temp.data == key) {
                return i;

            }
            temp = temp.Next;
            i++;
        }
        return -1;
    }
    // //seaech key in recursive search
    // int findKey2(int key){
    // if(nead.data==key)
    // }

    // ---------------------------------:display:---------------------------------------------------------------
    void display() {
        Node temp = Head;
        if (Head == null) {
            System.out.println("LL is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.Next;
        }
        System.err.print("null\n");

    }

    // ----------------------------------:Main:-------------------

    public static void main(String args[]) {
        Linkedlist2 ll = new Linkedlist2();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(21);
        ll.addLast(5);
        ll.addLast(7);
        ll.display();
        ll.reverse();
        ll.display();

    }

}
