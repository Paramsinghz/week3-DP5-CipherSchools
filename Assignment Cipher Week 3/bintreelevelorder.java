/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> res = new LinkedList();
        ArrayList<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        res.add(root);

        while (!res.isEmpty()) {
            ArrayList<Integer> subarr = new ArrayList<>();
            int s = res.size();
            for (int i = 0; i < s; i++) {
                TreeNode curr = res.poll();

                subarr.add(curr.val);

                if (curr.left != null) {
                    res.add(curr.left);
                }
                if (curr.right != null) {
                    res.add(curr.right);
                }
            }
            ans.add(subarr);
        }
        return ans;
    }
}