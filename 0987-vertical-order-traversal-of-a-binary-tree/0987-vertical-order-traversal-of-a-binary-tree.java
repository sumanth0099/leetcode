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
    int min = 0;
    int max = 0;
    int levels = 0;

    HashMap<ArrayList<Integer>, ArrayList<Integer>> table = new HashMap<>();

    public void InorderTraversal(TreeNode root, int x, int y) {
        if (root == null)
            return;

        levels = Math.max(levels, x);
        min = Math.min(min, y);
        max = Math.max(max, y);

        ArrayList<Integer> key = new ArrayList<>();
        key.add(x);
        key.add(y);

        if (!table.containsKey(key))
            table.put(key, new ArrayList<>(Arrays.asList(root.val)));
        else
            table.get(key).add(root.val);

        InorderTraversal(root.left, x + 1, y - 1);
        InorderTraversal(root.right, x + 1, y + 1);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        InorderTraversal(root, 0, 0);

        List<List<Integer>> solution = new ArrayList<>();

        while (min <= max) {

            List<Integer> col = new ArrayList<>();

            for (int i = 0; i <= levels; i++) {

                ArrayList<Integer> key = new ArrayList<>();
                key.add(i);
                key.add(min);

                if (table.containsKey(key)) {

                    ArrayList<Integer> vals = table.get(key);

                    Collections.sort(vals);

                    col.addAll(vals);
                }
            }

            solution.add(col);
            min++;
        }

        return solution;
    }
}