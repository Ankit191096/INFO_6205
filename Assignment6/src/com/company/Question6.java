package com.company;


// Tried on LeetCode
// Time Complexity = O(N)
// Space Complexity = O(N)


public class Question6 {
    public boolean isSymmetric(TreeNode root) {
        return same(root.left, root.right);
    }
    private boolean same(TreeNode l, TreeNode r) {
        if (l == null || r == null){
            return l == r;
        }

        return same(l.right, r.left)
                && same(l.left, r.right)
                && r.val == l.val;
    }
}
