package com.mgleetcode.binarytree.easy;

import com.mgleetcode.binarytree.TreeNode;

/*
TC O(n)
SC O(n)
*/
public class LC110_Balanced_Binary_Tree {
    public boolean isBalanced(TreeNode root) {
        return dfs(root)[0] == 1;
    }

    int[] dfs(TreeNode root) {
        if (root == null)
            return new int[]{1, 0};

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        boolean isBalanced = ((left[0] == 1 && right[0] == 1) && (Math.abs(left[1] - right[1]) <= 1));
        int height = 1 + Math.max(left[1], right[1]);

        return new int[]{isBalanced ? 1 : 0, height};
    }
}
