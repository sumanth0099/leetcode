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
    int max = Integer.MIN_VALUE;
    public int findPath(TreeNode root)
    {
        if(root==null)
        return 0;
        int left = findPath(root.left);
        int right = findPath(root.right);
        max = Math.max(max,root.val+left+right);
        return Math.max(0,root.val+Math.max(left,right));
    }
    public int maxPathSum(TreeNode root) {
        findPath(root);
        return max;
    }
}