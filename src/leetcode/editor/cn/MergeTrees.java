package leetcode.editor.cn;

/**
 * 617. 合并二叉树
 *
 * @author ShenYunWen
 **/
public class MergeTrees {

    public TreeNode func(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        } else if (t1 == null) {
            return t2;
        } else if (t2 == null) {
            return t1;
        } else {
            t1.val += t2.val;
            t1.left = func(t1.left, t2.left);
            t1.right = func(t1.right, t2.right);
            return t1;
        }
    }
}

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}