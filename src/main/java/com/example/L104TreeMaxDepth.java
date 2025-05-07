package com.example;

/**
 * 二叉树的最大深度
 */
public class L104TreeMaxDepth {

    /**
     * 深度优先搜索
     */
    public int maxDepth(TreeNode root) {
        if (root != null) {
            return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
        } else {
            return 0;
        }
    }
}
