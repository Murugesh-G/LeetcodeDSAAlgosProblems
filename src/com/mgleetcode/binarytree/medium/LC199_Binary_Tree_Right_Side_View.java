package com.mgleetcode.binarytree.medium;

import com.mgleetcode.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
TC O(n)
SC O(n)
*/
public class LC199_Binary_Tree_Right_Side_View {
    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            TreeNode rightSide = null;

            for (int i = 0; i < queueSize; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    rightSide = node;
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            if (rightSide != null)
                res.add(rightSide.val);
        }
        return res;
    }
}
