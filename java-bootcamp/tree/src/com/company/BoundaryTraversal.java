package com.company;

import java.util.ArrayList;

public class BoundaryTraversal {
    public static ArrayList<Integer> traverseBoundary(TreeNode node) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(node.val);
        leftTree(node, list);
        leafNode(node,list);

        rightTree(node,list);
        return list;
    }

    private static void rightTree(TreeNode node, ArrayList<Integer> list) {

    }

    private static void leafNode(TreeNode node, ArrayList<Integer> list) {
        if (node == null ){
            return;
        }
        if (node.left == null && node.right == null){
            list.add(node.val);
        }
        leftTree(node.left,list);
        leftTree(node.right,list);
    }

    private static void leftTree(TreeNode node, ArrayList<Integer> list) {
        if (node.right == null && node.left == null) {
            return;
        }
        if (node.left != null) {
            list.add(node.val);
            leftTree(node.left, list);
        }
        if (node.right != null) {
            list.add(node.val);
            leftTree(node.right, list);
        }

    }
}
