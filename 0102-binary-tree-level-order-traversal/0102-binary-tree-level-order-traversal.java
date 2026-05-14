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
 import java.util.*;
class Solution {
    public ArrayList<TreeNode>findNextOne(ArrayList<TreeNode>list,ArrayList<Integer>l)
    {
        ArrayList<TreeNode>solution = new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            TreeNode cur = list.get(i);
            if(cur==null)
            continue;
            if(cur.left!=null){
            solution.add(cur.left);
            l.add(cur.left.val);
            }
            if(cur.right!=null){
            solution.add(cur.right);
            l.add(cur.right.val);
            }
        }
        return solution;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<TreeNode>list = new ArrayList<>();
        list.add(root);
        List<List<Integer>>solution = new ArrayList<>();
        if(root!=null)
        solution.add(Arrays.asList(root.val));
        while(!list.isEmpty())
        {
            
        ArrayList<Integer>temp = new ArrayList<>();
            list = findNextOne(list,temp);
            if(temp.size()>0)
            solution.add(new ArrayList<>(temp));
        }
        return solution;
    }
}