package hot100.No_543二叉树的直径;


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
public class DiameterOfBinaryTree {

    int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    public int depth(TreeNode root){
        
        if (root == null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);

        max = Math.max(max, left + right + 1 - 1);
        // 这棵树的总高度
        return Math.max(left, right) + 1;
    }
}
