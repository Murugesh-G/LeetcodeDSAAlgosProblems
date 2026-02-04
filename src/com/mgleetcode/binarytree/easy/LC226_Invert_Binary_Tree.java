package com.mgleetcode.binarytree.easy;

import com.mgleetcode.binarytree.TreeNode;

/*
TC O(n)
SC O(n)
*/
public class LC226_Invert_Binary_Tree {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
