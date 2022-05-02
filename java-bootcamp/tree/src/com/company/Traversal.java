package com.company;

import java.util.*;

public class Traversal {

    public static void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val);
        System.out.print("-");
        preorder(node.left);
        preorder(node.right);
    }

    public static void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.val);
        System.out.print("-");
        inorder(node.right);
    }

    public static void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val);
        System.out.print("-");
    }

    public static List<Integer> IterativePreorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while (!stack.empty()) {
            root = stack.pop();
            list.add(root.val);
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return list;
    }


    public static ArrayList <Integer> IterativeInorder(Node node) {
        ArrayList <Integer> list = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if (node == null) return list;
        while (true) {
            if (node != null) {
                st.push(node);
                node = node.left;
            } else {
                if (st.isEmpty()) break;
                node = st.pop();
                list.add(node.val);
                node = node.right;
            }
        }
        return list;
    }


    public static List<List<Integer>> BFS(Node node) {
        return Traversal.levelOrder(node);
    }

    public static List<List<Integer>> levelOrder(Node root) {

        Queue<Node> queue = new LinkedList<Node>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if (root == null) return wrapList;

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }

}
