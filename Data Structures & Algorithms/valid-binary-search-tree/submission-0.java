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
    private boolean f(TreeNode root,int max,int min){
        if(root == null) 
        return true;

        if(root.val >= max || root.val <= min) {
            return false;
        }
        return f(root.left,root.val,min) && f(root.right,max,root.val);
    }
    public boolean isValidBST(TreeNode root) {
        return f(root,100000,-100000);
    }
}
