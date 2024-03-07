package hot100.No_226翻转二叉树;

import hot100.test.Test;

class TreeNode {
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

public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
//        TreeNode tmp = invertTree(root.left);
//        root.left = invertTree(root.right);
//        root.right = tmp;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
