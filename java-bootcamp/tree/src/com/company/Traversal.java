package com.company;

public class Traversal {

    public static void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data);
        System.out.print("-");
        preorder(node.left);
        preorder(node.right);
    }

    public static void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data);
        System.out.print("-");
        inorder(node.right);
    }

    public static void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data);
        System.out.print("-");
    }


}
