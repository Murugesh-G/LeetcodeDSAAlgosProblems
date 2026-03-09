package com.mgleetcode.binarytree.easy;

import com.mgleetcode.binarytree.TreeNode;

/*
TC O(m*n)
SC O(m+n)
*/
public class LC572_Subtree_of_Another_Tree {
    public static void main(String[] args) {

    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null)
            return true;
        if (root == null)
            return false;

        if (sameTree(root, subRoot))
            return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    boolean sameTree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null)
            return true;

        if (root != null && subRoot != null && root.val == subRoot.val) {
            return sameTree(root.left, subRoot.left) && sameTree(root.right, subRoot.right);
        }
        return false;
    }
}
