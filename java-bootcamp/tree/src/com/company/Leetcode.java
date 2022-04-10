package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode {

    //    https://leetcode.com/problems/binary-tree-preorder-traversal/


    private void preorderFUN(List<Integer> preorder, TreeNode node) {
        if (node == null) {
            return;
        }
        preorder.add(node.val);
        preorderFUN(preorder, node.left);
        preorderFUN(preorder, node.right);

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        preorderFUN(preorder, root);
        return preorder;
    }

    //    https://leetcode.com/problems/binary-tree-inorder-traversal/
    private void inorderFUN(List<Integer> inorder, TreeNode node) {
        if (node == null) {
            return;
        }

        inorderFUN(inorder, node.left);
        inorder.add(node.val);
        inorderFUN(inorder, node.right);

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inorderFUN(inorder, root);
        return inorder;
    }


    //    https://leetcode.com/problems/binary-tree-postorder-traversal/
    private void postorderFUN(List<Integer> postorder, TreeNode node) {
        if (node == null) {
            return;
        }

        postorderFUN(postorder, node.left);

        postorderFUN(postorder, node.right);
        postorder.add(node.val);

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        postorderFUN(postorder, root);
        return postorder;
    }
}
/*
  Definition for a binary tree node.
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
 */