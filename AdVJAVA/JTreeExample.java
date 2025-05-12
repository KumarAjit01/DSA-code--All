package AdVJAVA;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeExample {
    public static void main(String[] args) {
        // Create the main JFrame
        JFrame frame = new JFrame("JTree Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the root node for the tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Computer");

        // Create child nodes
        DefaultMutableTreeNode driveC = new DefaultMutableTreeNode("C Drive");
        DefaultMutableTreeNode driveD = new DefaultMutableTreeNode("D Drive");

        // Create sub-child nodes for C Drive
        DefaultMutableTreeNode programFiles = new DefaultMutableTreeNode("Program Files");
        DefaultMutableTreeNode users = new DefaultMutableTreeNode("Users");
        DefaultMutableTreeNode windows = new DefaultMutableTreeNode("Windows");

        // Add sub-child nodes to C Drive
        driveC.add(programFiles);
        driveC.add(users);
        driveC.add(windows);

        // Create sub-child nodes for D Drive
        DefaultMutableTreeNode movies = new DefaultMutableTreeNode("Movies");
        DefaultMutableTreeNode documents = new DefaultMutableTreeNode("Documents");

        // Add sub-child nodes to D Drive
        driveD.add(movies);
        driveD.add(documents);

        // Add child nodes to root
        root.add(driveC);
        root.add(driveD);

        // Create the JTree and pass the root node
        JTree tree = new JTree(root);

        // Add the tree to a scroll pane
        JScrollPane scrollPane = new JScrollPane(tree);

        // Add the scroll pane to the frame
        frame.add(scrollPane);

        // Set frame visibility
        frame.setVisible(true);
    }
}
