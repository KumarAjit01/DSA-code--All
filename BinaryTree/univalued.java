package BinaryTree;

//Binary Tree QuestionsQuestion 1 :
//Check if a Binary Tree is univalued or not We have a binary tree,
//the task is to check if the binary tree is univalued or not.
//If found to be true, then print “YES”. Otherwise, print “NO”.

public class univalued {
    public static class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;

        }
    }

    public static boolean isUnivalued(Node root, int value) {
        // Base case: an empty tree is univalued
        if (root == null)
            return true;

        // Check if current node matches the expected value
        if (root.value != value)
            return false;

        // Recursively check left and right subtrees
        return isUnivalued(root.left, value) && isUnivalued(root.right, value);
    }

    public static boolean checkUnivaluedTree(Node root) {
        if (root == null) {
            return true; // Edge case: an empty tree is univalued
        }
        return isUnivalued(root, root.value);
    }

    public static void main(String args[]) {
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(2);
        System.out.println(checkUnivaluedTree(root));
    }

}
