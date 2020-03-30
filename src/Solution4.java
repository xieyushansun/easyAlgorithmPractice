/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//面试题27. 二叉树的镜像

class Solution4 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root != null){
            reverse(root);
        }
        return root;
    }
    void reverse(TreeNode root){
        if (root.left != null){
            reverse(root.left);
        }
        if (root.right != null){
            reverse(root.right);
        }
        TreeNode temp;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}