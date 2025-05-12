package BinaryTree;

public class basic {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class BinaryTree {
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
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);

        System.out.println(root.data);

    }

}
