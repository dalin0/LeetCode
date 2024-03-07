package Code_Capriccio.二叉树.二叉树的递归遍历.后序遍历;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){}
        public TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }

    public List<Integer> Order(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrder(list, root);
        return list;
    }

    public static void postOrder(List<Integer> list, TreeNode root) {
        if (root == null) return;
        postOrder(list, root.left);
        postOrder(list, root.right);
        list.add(root.val);
    }
}
