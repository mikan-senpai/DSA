package com.company;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Traversal.inorder(root);
        System.out.println();
        Traversal.preorder(root);
        System.out.println();
        Traversal.postorder(root);
    }

}

