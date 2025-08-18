package com.mgleetcode.binarytree.medium;

import com.mgleetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
TC O(n)
SC O(n)
*/
public class LC102_BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        LC102_BinaryTreeLevelOrderTraversal obj = new LC102_BinaryTreeLevelOrderTraversal();

        TreeNode four = new TreeNode(15, null, null);
        TreeNode five = new TreeNode(7, null, null);
        TreeNode three = new TreeNode(20, four, five);
        TreeNode two = new TreeNode(9, null, null);
        TreeNode one = new TreeNode(3, two, three);
        List<List<Integer>> result = obj.levelOrder(one);
        System.out.println(result);

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currLevel = new ArrayList<>();
            while (size != 0) {
                TreeNode node = queue.poll();
                currLevel.add(node.val());
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                size--;
            }
            result.add(currLevel);
        }
        return result;
    }
}
