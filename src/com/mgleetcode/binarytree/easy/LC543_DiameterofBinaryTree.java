package com.mgleetcode.binarytree.easy;

import com.mgleetcode.binarytree.TreeNode;

public class LC543_DiameterofBinaryTree {
    public static void main(String[] args) {
        TreeNode four = new TreeNode(null, null, 4);
        TreeNode five = new TreeNode(null, null, 5);
        TreeNode two = new TreeNode(four, five, 2);
        TreeNode three = new TreeNode(null, null, 3);
        TreeNode one = new TreeNode(three, two, 1);

        LC543_DiameterofBinaryTree obj = new LC543_DiameterofBinaryTree();
        System.out.println(obj.diameterOfBinaryTree(one));

    }

    // Function to find the diameter of a binary tree
    public int diameterOfBinaryTree(TreeNode root) {
        // Initialize the variable to store the diameter of the tree
        int[] diameter = new int[1];
        diameter[0] = 0;

        // Call the height function to traverse the tree and calculate diameter
        height(root, diameter);

        // Return the calculated diameter
        return diameter[0];
    }

    // Function to calculate the height of the tree and update the diameter
    private int height(TreeNode node, int[] diameter) {
        // Base case: If the node is null, return 0 indicating an empty tree height
        if (node == null) {
            return 0;
        }

        // Recursively calculate the height of left and right subtrees
        int[] lh = new int[1];
        int[] rh = new int[1];
        lh[0] = height(node.left, diameter);
        rh[0] = height(node.right, diameter);

        // Update the diameter with the maximum of current diameter
        diameter[0] = Math.max(diameter[0], lh[0] + rh[0]);

        // Return the height of the current node's subtree
        return 1 + Math.max(lh[0], rh[0]);
    }
}
