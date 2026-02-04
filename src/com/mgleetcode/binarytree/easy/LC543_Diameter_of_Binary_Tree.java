package com.mgleetcode.binarytree.easy;

import com.mgleetcode.binarytree.TreeNode;

/*
TC O(n)
SC O(n)
*/
public class LC543_Diameter_of_Binary_Tree {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        dfs(root, res);
        return res[0];
    }

    int dfs(TreeNode root, int[] res) {
        if (root == null)
            return 0;

        int left = dfs(root.left, res);
        int right = dfs(root.right, res);
        res[0] = Math.max(res[0], left + right);
        return 1 + Math.max(left, right);
    }
}
