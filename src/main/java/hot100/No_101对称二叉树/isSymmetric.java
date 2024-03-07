package hot100.No_101对称二叉树;

import java.util.LinkedList;
import java.util.Queue;

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

public class isSymmetric {

    /**
     * 迭代方法
     */
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tree1 = queue.poll();
            TreeNode tree2 = queue.poll();
            if (tree1 == null && tree2 == null){
                continue;
            }
            if(tree1 == null || tree2 == null){
                return false;
            }
            if(tree1.val != tree2.val){
                return false;
            }
            queue.add(tree1.left);
            queue.add(tree2.right);

            queue.add(tree1.right);
            queue.add(tree2.left);
        }
        return true;
    }
    /**
     * 递归方法
     */
    public boolean isSymmetric2(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 ==null) return false;
        if (t1.val != t2.val) return false;
        return  isSymmetric2(t1.left, t2.right) && isSymmetric2(t1.right, t2.left);
    }

    public boolean isSymmetricTwo(TreeNode root) {
        return isSymmetric2(root, root);
    }

}
