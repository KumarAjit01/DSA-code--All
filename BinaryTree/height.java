package BinaryTree;

public class height {
    public static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;

        }
    }

    // height of a treee
    public static int heightof(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = heightof(root.left);
        int rh = heightof(root.right);
        return Math.max(lh, rh) + 1;
    }

    // count of the node
    public static int countof(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = countof(root.left);
        int rh = countof(root.right);
        return lh + rh + 1;
    }

    // Add of the root value total
    public static int sumofroot(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = sumofroot(root.left);
        int rh = sumofroot(root.right);
        return lh + rh + root.val;
    }

    // max of the root value
    public static int maxv(Node root) {
        if (root == null) {
            return 0;
        }
        int rootval = root.val;
        int lh = maxv(root.left);
        int rh = maxv(root.right);
        return Math.max(rootval, Math.max(lh, rh));
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
        System.out.println(maxv(root));

    }

}
