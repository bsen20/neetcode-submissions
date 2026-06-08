/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    boolean flag = true;
    private int f(TreeNode root){
        if(root == null)
        return 0;

        int l = f(root.left);
        int r = f(root.right);

        if(Math.abs(l-r) > 1)
        flag = false;

        return Math.max(l,r)+1;
    }
    public boolean isBalanced(TreeNode root) {
        f(root);
        return flag;
    }
}
