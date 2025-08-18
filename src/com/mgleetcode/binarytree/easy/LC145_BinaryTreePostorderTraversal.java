package com.mgleetcode.binarytree.easy;

import com.mgleetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
TC O(n)
SC O(n)
*/
public class LC145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    void postOrder(TreeNode node, List<Integer> arr) {
        if (node == null) return;
        postOrder(node.left, arr);
        postOrder(node.right, arr);
        arr.add(node.val);
    }

}
