package Code_Capriccio.二叉树.二叉树的递归遍历.前序遍历;

import Code_Capriccio.二叉树.二叉树的递归遍历.TreeNode;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.List;

public class PreOrder {

    class TreeNode {

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

    public static void main(String[] args) {

    }

    public static List<Integer> Order(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(list,root);
        return list;
    }

    public static void preOrder(List<Integer> list, TreeNode root) {
        if (root == null) return;
        list.add(root.val);
        preOrder(list, root.left);
        preOrder(list, root.right);
    }
}
