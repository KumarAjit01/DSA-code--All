package BinaryTree;

public class diametertree {
    public static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;

        }
    }

    public static int heightof(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = heightof(root.left);
        int rh = heightof(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int daimeter(Node root) {
        if (root == null)
            return 0;

        int leftdiam = daimeter(root.left);
        int leftht = heightof(root.left);
        int rightdiam = daimeter(root.right);
        int rightht = heightof(root.right);
        int selfdiam = leftht + rightht + 1;
        return Math.max(selfdiam, Math.max(leftdiam, rightdiam));
    }

    public static void main(String arg[]) {
        Node root = new Node(40);
        Node a = new Node(5);
        Node b = new Node(6);
        root.left = a;
        root.right = b;

        Node c = new Node(12);
        Node d = new Node(13);
        Node e = new Node(16);
        Node f = new Node(19);
        a.left = c;
        c.left = d;

        b.left = e;
        d.left = f;
        System.out.println(daimeter(root));
    }

}
