package com.company;

// Tried on LeetCode
// Time Complexity = O(N)
// Space Complexity = O(N)


public class Question3 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum,0);
    }

    private boolean dfs(TreeNode root,int targetSum,int sum){
        if(root==null){
            return false;
        }

        sum += root.val;

        if(sum==targetSum && root.left==null && root.right==null){
            return true;
        }

        return dfs(root.left,targetSum,sum) || dfs(root.right,targetSum,sum);

    }
}
