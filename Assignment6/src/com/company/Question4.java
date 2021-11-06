package com.company;

// Tried on LeetCode
// Time Complexity = O(N)
// Space Complexity = O(N)


public class Question4 {
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (l == -1 || r == -1){
            return -1;
        }

        if (Math.abs(l - r) > 1){
            return -1;
        }

        return 1 + Math.max(l, r);
    }
}
