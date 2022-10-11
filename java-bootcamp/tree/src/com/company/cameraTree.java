package com.company;

public class cameraTree {
    private int covered = 0, please_cover = 1, has_camera = 2;
    private int camera = 0;

    public int minCameraCover(TreeNode root) {
        return postorder(root) == please_cover ? ++camera : camera;
    }

    private int postorder(TreeNode root) {
        if (root == null) {
            return covered;
        }

        int left = postorder(root.left);
        int right = postorder(root.right);

        if (left == please_cover || right == please_cover) {
            camera++;
            return has_camera;
        } else if (left == has_camera || right == has_camera) {
            return covered;
        } else {
            return please_cover;
        }
    }
}
