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
        TreeNode root = new TreeNode(1, null, null);
        List<String> res = obj.binaryTreePaths(root);
        System.out.println(res);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        if (root != null) {
            searchBT(root, "", answer);
        }
        return answer;
    }

    private static void searchBT(TreeNode root, String path, List<String> answer) {
        if (root.left == null && root.right == null) {
            answer.add(path + root.val);
        }

        if (root.left != null) {
            searchBT(root.left, path + root.val + "->", answer);
        }

        if (root.right != null) {
            searchBT(root.right, path + root.val + "->", answer);
        }
    }
}
