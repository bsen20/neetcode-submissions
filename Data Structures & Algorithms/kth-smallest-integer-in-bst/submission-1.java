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
    int cnt = 0 , ans = 0;
    void inorder(TreeNode root,List<Integer>temp,int k){
        if(root == null)
        return;
        inorder(root.left,temp,k);
        cnt++;
        if(cnt == k)
        ans = root.val;
        //temp.add(root.val);
        inorder(root.right,temp,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>temp = new ArrayList<>();
        inorder(root,temp,k);
        return ans;
    }
}
