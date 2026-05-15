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
    int depth = 0;
    public void Hlp(int val,TreeNode root)
    {
        if(root==null)
        return;
        Hlp(val+1,root.left);
        Hlp(val+1,root.right);
        depth=Math.max(depth,val);
    }
    public int maxDepth(TreeNode root) {
        Hlp(1,root);
        return depth;
    }
}