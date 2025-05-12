package BinaryTree;

public class preOrder {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static class BinaryTree {

        static int idx = -1;

        public static Node buildTree(int root[]) {
            idx++;
            if (root[idx] == -1) {
                return null;
            }
            Node newNode = new Node(root[idx]);
            newNode.left = buildTree(root);
            newNode.right = buildTree(root);
            return newNode;

        }
        // root
        // left
        // right

        public static void preoerder(Node root) {
            if (root == null) {
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            preoerder(root.left);
            preoerder(root.right);
        }

    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
        bt.preoerder(root);
    }
}
