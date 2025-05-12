package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrder {
    public static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;

        }
    }

    public static void display(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ->");
        if (root.left != null)
            System.out.print(root.left.val + " ");
        if (root.right != null)
            System.out.print(root.right.val + " ");
        System.out.println();
        display(root.left);
        display(root.right);

    }

    public static void bts(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null) {
            q.add(root);
        }
        while (q.size() > 0) {
            Node temp = q.peek();
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
            System.out.print(temp.val + " ");
            q.remove();

        }

    }

    public static void main(String arg[]) {
        Node root = new Node(4);
        Node a = new Node(5);
        Node b = new Node(6);
        root.left = a;
        root.right = b;

        Node c = new Node(12);
        Node d = new Node(13);
        Node e = new Node(16);
        Node f = new Node(19);
        a.left = c;
        a.right = d;

        b.left = e;
        b.right = f;
        // display(root);
        bts(root);
    }

}
