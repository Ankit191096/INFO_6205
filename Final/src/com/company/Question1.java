package com.company;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    private void fillHashmap(int[] level){
        for(int i = 0; i < level.length; i++){
            map.put(level[i], i);
        }
    }

    public static void main(String[] args) {
        Question1 tree = new Question1();
        int[] inorder = new int[]{4, 2, 5, 1, 6, 3, 7};
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        tree.fillHashmap(input);
        Node root = tree.createTree(inorder, input, 0, input.length - 1);
        tree.printInorder(root);
    }

    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
            left = right = null;
        }
    }
    private void printInorder(Node node){
        if(node == null)
            return;
        printInorder(node.left);
        System.out.println(node.value + "");
        printInorder(node.right);
    }

    private Node createTree(int[] input, int[] level, int start, int end){
        if(start > end)
            return null;
        int pivot = start;
        for(int i = start + 1; i < end + 1; i++){
            int temp = input[i];
            if(map.get(input[pivot]) > map.get(temp)) {
                pivot = i;
            }
        }
        int rootvalue = input[pivot];

        Node root = new Node(rootvalue);

        if(start == end)
            return root;

        root.left = createTree(input, level, start, pivot - 1);
        root.right = createTree(input, level, pivot + 1, end);
        return root;
    }
}
