package Code_Capriccio.二叉树.二叉树的递归遍历.中序遍历;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class InOrder {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){}
        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode (TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }

    public static List<Integer> Order(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(list, root);
        return list;
    }

    public static void inOrder(List<Integer> list, TreeNode root) {
        if (root == null) return;
        inOrder(list, root.left);
        list.add(root.val);
        inOrder(list, root.right);
    }
}
