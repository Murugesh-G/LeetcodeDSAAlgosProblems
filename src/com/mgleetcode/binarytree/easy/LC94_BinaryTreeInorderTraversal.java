package com.mgleetcode.binarytree.easy;

import com.mgleetcode.util.Node;

import java.util.ArrayList;
import java.util.List;

/*
TC O(n)
SC O(n)
*/
public class LC94_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(Node root) {
        List<Integer> arr = new ArrayList<>();
        inOrder(root, arr);
        return arr;
    }

    void inOrder(Node node, List<Integer> arr) {
        if (node == null) return;
        inOrder(node.left, arr);
        arr.add(node.data);
        inOrder(node.right, arr);
    }
}


