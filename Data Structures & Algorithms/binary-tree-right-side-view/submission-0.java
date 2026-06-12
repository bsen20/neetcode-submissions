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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null)
        return ans;
        Queue<TreeNode>q = new LinkedList<>();
        q.offer(root);
        while(q.size()>0){
            int currentRightView = -1;
            int sz = q.size();

            for(int i =0;i<sz;i++){
                TreeNode node = q.poll();
                if(node.left != null)
                q.offer(node.left);
                if(node.right != null)
                q.offer(node.right);
                currentRightView = node.val;
            }
            ans.add(currentRightView);
        }
        return ans;
    }
}
