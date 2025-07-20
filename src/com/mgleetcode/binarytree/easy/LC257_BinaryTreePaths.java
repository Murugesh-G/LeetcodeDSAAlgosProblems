package com.mgleetcode.binarytree.easy;

import java.util.ArrayList;
import java.util.List;

/*
TC O(n)
SC O(1)
*/
public class LC257_BinaryTreePaths {
    public static void main(String[] args) {
        LC257_BinaryTreePaths obj = new LC257_BinaryTreePaths();

        TreeNode five = new TreeNode(5, null, null);
        TreeNode two = new TreeNode(2, null, five);
        TreeNode three = new TreeNode(3, null, null);
        TreeNode one = new TreeNode(1, two, three);

        List<String> res = obj.binaryTreePaths(one);
        System.out.println(res);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        if (root == null)
            return answer;

        return dfs(root, "", answer);
    }

    private static List<String> dfs(TreeNode root, String path, List<String> answer) {
        if (root.left == null && root.right == null)
            answer.add(path + root.val);

        if (root.left != null)
            dfs(root.left, path + root.val + "->", answer);

        if (root.right != null)
            dfs(root.right, path + root.val + "->", answer);
        return answer;
    }


}
