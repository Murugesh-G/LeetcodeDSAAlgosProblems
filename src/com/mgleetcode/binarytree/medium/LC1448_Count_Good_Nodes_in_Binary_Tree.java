package com.mgleetcode.binarytree.medium;

import com.mgleetcode.binarytree.TreeNode;

/*
TC O(n)
SC O(n)
*/
public class LC1448_Count_Good_Nodes_in_Binary_Tree {
    public static void main(String[] args) {

    }

    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    int dfs(TreeNode node, int maxValue) {
        if (node == null)
            return 0;

        int res = (node.val >= maxValue) ? 1 : 0;
        maxValue = Math.max(node.val, maxValue);
        res += dfs(node.left, maxValue);
        res += dfs(node.right, maxValue);
        return res;
    }
}
