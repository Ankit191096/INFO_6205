package com.company;


// Tried on LeetCode
// Time Complexity = O(N)
// Space Complexity = O(N)


public class Question5 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }

        if (root.val == subRoot.val){
            boolean ans = isSame(root, subRoot);
            if (ans){
                return true;
            }
        }

        return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
    }

    private boolean isSame(TreeNode root, TreeNode subRoot)
    {
        if (root == null && subRoot == null){
            return true;
        }
        if (root == null || subRoot == null){
            return false;
        }

        if (root.val == subRoot.val) {
            return (isSame (root.right, subRoot.right) && isSame (root.left, subRoot.left));
        }

        return false;
    }
}
