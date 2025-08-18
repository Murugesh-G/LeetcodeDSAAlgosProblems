package com.mgleetcode.binarytree.easy;

import com.mgleetcode.util.TreeNode;

public class LC530_MinimumAbsoluteDifferenceinBST {
    int min_diff = Integer.MAX_VALUE;
    int curr_diff = -1;

    public static void main(String[] args) {
        LC530_MinimumAbsoluteDifferenceinBST obj = new LC530_MinimumAbsoluteDifferenceinBST();
        String str = "/home/";
        System.out.println(Character.isLetter('$'));
    }

    public int getMinimumDifference(TreeNode root) {
        if (root.left != null)
            getMinimumDifference(root.left);

        if (curr_diff >= 0)
            min_diff = Math.min(min_diff, root.val - curr_diff);
        curr_diff = root.val;

        if (root.right != null)
            getMinimumDifference(root.right);
        return min_diff;
    }
}
