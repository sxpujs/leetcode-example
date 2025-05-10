package com.example;

/**
 * 判断是否为满二叉树
 */
public class FullTree {

    public boolean isFullBinaryTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left != null && root.right != null) {
            return isFullBinaryTree(root.left) && isFullBinaryTree(root.right);
        }
        return false;
    }

}
