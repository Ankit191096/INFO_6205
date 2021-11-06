package com.company;
import java.util.ArrayList;

// Tried on LeetCode
// Time Complexity = O(N)
// Space Complexity = O(N)


public class Question7 {
    public void flatten(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        preOrder(root,list);
        TreeNode dummy = root;

        for(int i = 1; i < list.size(); i++) {
            dummy.right = new TreeNode(list.get(i));
            dummy.left = null;
            dummy = dummy.right;
        }
    }
    public void preOrder(TreeNode node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        preOrder(node.left, list);
        preOrder(node.right, list);
    }
}
