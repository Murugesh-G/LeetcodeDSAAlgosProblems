package com.mgleetcode.binarytree.medium;

import com.mgleetcode.binarytree.TreeNode;

public class LC98_Validate_Binary_Search_Tree {
    public static void main(String[] args) {

    }

    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean isValid(TreeNode node, long left, long right) {
        if (node == null)
            return true;

        if (!(node.val > left && node.val < right))
            return false;

        return (isValid(node.left, left, node.val) && isValid(node.right, node.val, right));
    }
}
