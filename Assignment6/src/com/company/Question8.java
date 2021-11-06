package com.company;
import java.util.ArrayList;
import java.util.List;

// Tried on LeetCode
// Time Complexity = O(M + N)
// Space Complexity = O(M + N)


public class Question8 {
    class Obj {
        int colIdx;
        int rowIdx;
        int val;
        Obj(int rowIdx, int colIdx, int val) {
            this.rowIdx = rowIdx;
            this.colIdx = colIdx;
            this.val = val;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<Obj> temp = new ArrayList<>();
        preorderTraversal(root, temp, 0, 0);
        temp.sort((Obj a, Obj b) -> {
            if(a.colIdx != b.colIdx){
                return Integer.compare(a.colIdx, b.colIdx);
            }

            if(a.rowIdx != b.rowIdx){
                return Integer.compare(a.rowIdx, b.rowIdx);
            }

            return Integer.compare(a.val, b.val);
        });
        List<List<Integer>> ans = new ArrayList<>();
        int prevCol = Integer.MIN_VALUE;
        List<Integer> res = null;
        for(Obj element: temp) {
            if(prevCol != element.colIdx) {
                if(res != null)
                    ans.add(res);
                res = new ArrayList<>();
            }
            res.add(element.val);
            prevCol = element.colIdx;
        }
        if(res != null)
            ans.add(res);
        return ans;
    }

    public void display(List<Obj> temp) {
        for(Obj element: temp) {
            System.out.println("row: "+ element.rowIdx + " col: "+ element.colIdx + " val: "+ element.val);
        }
        System.out.println();
    }

    public void preorderTraversal(TreeNode root, List<Obj> temp, int row, int col) {
        if(root == null)
            return;
        temp.add(new Obj(row, col, root.val));
        preorderTraversal(root.left, temp, row+1, col-1);
        preorderTraversal(root.right, temp, row+1, col+1);
    }
}
