//we have a singly linked list of characters,
//write a function that returns true if the given ia a palindrome 
//,else false
package Stack;

import java.util.*;

public class palindrome_linkedlist {
    public static class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    public static void addAtEnd(char data) {
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    // Function to check if the linked list is a palindrome
    public static boolean isPalindrome(Node head) {
        // Use a stack to store characters from the linked list
        Stack<Character> stack = new Stack<>();
        Node temp = head;

        // Push all elements of the linked list into the stack
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        // Compare elements from the stack with the linked list
        while (temp != null) {
            if (temp.data != stack.pop()) {
                return false; // Not a palindrome
            }
            temp = temp.next;
        }

        return true; // It is a palindrome
    }

    public static void main(String args[]) {
        addAtEnd('A');
        addAtEnd('B');
        addAtEnd('C');
        addAtEnd('B');
        addAtEnd('A');
        display();

        System.out.println("\nIs Palindrome: " + isPalindrome(head)); // Output: true
    }
}