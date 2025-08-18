package com.mgleetcode.binarytree.easy;

import com.mgleetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
TC O(n)
SC O(n)
*/
public class LC144_Binary_Tree_Preorder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    void preOrder(TreeNode node, List<Integer> arr) {
        if (node == null) return;
        arr.add(node.val);
        preOrder(node.left, arr);
        preOrder(node.right, arr);
    }

}
