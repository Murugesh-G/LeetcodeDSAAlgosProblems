package com.mgleetcode.binarytree.easy;

import com.mgleetcode.binarytree.TreeNode;
/*
TC O(h) where h is the height of the tree
SC O(1)
*/
public class LC235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode cur = root;
        while (cur != null) {
            if (p.val > cur.val && q.val > cur.val) {
                cur = cur.right;
            } else if (p.val < cur.val && q.val < cur.val) {
                cur = cur.left;
            } else {
                return cur;
            }
        }
        return cur;
    }
}
