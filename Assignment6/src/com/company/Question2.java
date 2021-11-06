package com.company;
import java.util.ArrayList;


// Tried on LeetCode
// Time Complexity = O(M + N)
// Space Complexity = O(M + N)


public class Question2 {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList();
        List<Integer> l2 = new ArrayList();
        depthFirstSearch(root1, l1);
        depthFirstSearch(root2, l2);
        return l1.equals(l2);
    }

    public void depthFirstSearch(TreeNode node, List<Integer> leafValues) {
        if (node != null) {
            if (node.left == null && node.right == null){
                leafValues.add(node.val);
            }
            depthFirstSearch(node.left, leafValues);
            depthFirstSearch(node.right, leafValues);
        }
    }
}
