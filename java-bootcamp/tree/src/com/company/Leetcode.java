package com.company;

import java.util.*;

import static java.util.Collections.reverse;

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

    //    https://leetcode.com/problems/maximum-depth-of-binary-tree/
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    /* same but striver code */
    public int maxDepthTUF(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = maxDepthTUF(root.left);
        int rightHeight = maxDepthTUF(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }


    //    https://leetcode.com/problems/balanced-binary-tree/
    public boolean isBalanced(TreeNode root) {
        return dfsheight(root) != -1;
    }

    public int dfsheight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = dfsheight(root.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = dfsheight(root.right);
        if (rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }


    //    https://leetcode.com/problems/diameter-of-binary-tree/
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        height(root, diameter);
        return diameter[0];
    }

    public int height(TreeNode node, int[] diameter) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left, diameter);
        int rightHeight = height(node.right, diameter);
        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }

//    https://leetcode.com/problems/binary-tree-maximum-path-sum/

    public int maxPathSum(TreeNode node) {

        int[] maxSum = new int[1];
        maxSum[1] = Integer.MIN_VALUE;
        find(node, maxSum);
        return maxSum[0];
    }

    public int find(TreeNode node, int[] maxSum) {
        if (node == null) {
            return 0;
        }
        int leftHeight = Math.max(0, find(node.left, maxSum));
        int rightHeight = Math.max(0, find(node.right, maxSum));
        maxSum[0] = Math.max(maxSum[0], leftHeight + rightHeight + node.val);
        return node.val + Math.max(leftHeight, rightHeight);
    }

//    https://leetcode.com/problems/path-sum/

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dsf(root, 0, targetSum);
    }

    public boolean dsf(TreeNode node, int currSum, int targetSum) {
        if (node == null) {
            return false;
        }
        currSum += node.val;
        if (node.left == null && node.right == null) {
            return currSum == targetSum;
        }
        return (dsf(node.left, currSum, targetSum) || dsf(node.right, currSum, targetSum));
    }

    // https://leetcode.com/problems/same-tree/    
//    public boolean isSameTree(Node p, Node q) {
//        ArrayList<Integer> pTree = new ArrayList<>();
//        ArrayList<Integer> qTree = new ArrayList<>();
//        inorderReturn(p,pTree);
//        inorderReturn(p,qTree);
//        return pTree.equals(qTree);
//    }
//
//    public ArrayList<Integer> inorderReturn(Node node,ArrayList<Integer> list) {
//        if (node == null) {
//            return null;
//        }
//        inorderReturn(node.left,list);
//        list.add(node.val);
//        inorderReturn(node.right,list);
//        return list;
//    }
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//    return traversal(p,q)==1;
//    }
//
//    public int traversal(TreeNode p, TreeNode q) {
//        if (p == null || q == null) {
//            return 0;
//        }
//        if (p.val != q.val) {
//            return -1;
//        }
//        traversal(p.left, q.left);
//        traversal(p.right, q.right);
//        return 1;
//    }


    static boolean isIdentical(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return true;
        else if (node1 == null || node2 == null)
            return false;

        return (
                (node1.val == node2.val)
                        && isIdentical(node1.left, node2.left)
                        && isIdentical(node1.right, node2.right)
        );
    }

    //    https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
    public List<List<Integer>> zigzagLevelOrder(TreeNode node) {
        if (node == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> outerList = new ArrayList<List<Integer>>();
        boolean LeftToRight = false;
        queue.offer(node);
        while (!queue.isEmpty()) {
            List<Integer> innerList = new ArrayList<>();
            int LevelSize = queue.size();
            for (int level = 0; level < LevelSize; level++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                innerList.add((queue.poll().val));
            }
            if (LeftToRight) {
                Collections.reverse(innerList);
                outerList.add(innerList);
                LeftToRight = false;
            }
        }
        return outerList;
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