package Code_Capriccio.二叉树.二叉树的递归遍历;

import sun.reflect.generics.tree.Tree;

import java.util.TreeMap;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(){}
    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode(TreeNode left, TreeNode right, int val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }
}
