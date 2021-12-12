package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Question2 {
    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
            left = right = null;
        }
    }

    private Node root = null;

    private boolean ifFoldableOrNot(){
        Queue<Node> queue = new LinkedList<>();
        if(root != null){
            queue.add(root.left);
            queue.add(root.right);
        }
        while(!queue.isEmpty()){
            Node firstNode = queue.remove();
            Node secondNode = queue.remove();

            if(firstNode == null && secondNode == null){
                continue;
            }
            if((firstNode == null && secondNode != null) || (firstNode != null && secondNode == null)){
                return false;
            }
            queue.add(firstNode.left);
            queue.add(firstNode.right);
            queue.add(secondNode.left);
            queue.add(secondNode.right);
        }
        return true;
    }


    public static void main(String[] args) {
       Question2 tree = new Question2();
       tree.root = tree.new Node(10);
       tree.root.left = tree.new Node(7);
       tree.root.right = tree.new Node(15);
       tree.root.left.right = tree.new Node(9);
       tree.root.right.left = tree.new Node(11);

       if(tree.ifFoldableOrNot()){
           System.out.println("False");
       }else{
           System.out.println("True");
       }
    }
}
