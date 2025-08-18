package com.mgleetcode.binarytree.easy;

import com.mgleetcode.util.TreeNode;

public class LC222_CountCompleteTreeNodes {
    public static void main(String[] args) {

    }

    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
