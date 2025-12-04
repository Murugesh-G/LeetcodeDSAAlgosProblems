package com.mgleetcode.binarytree;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TreeNode {
    public TreeNode right;
    public TreeNode left;
    int value;
}
