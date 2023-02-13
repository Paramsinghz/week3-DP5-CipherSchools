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
    public int countNodes(TreeNode root) {

        if (root == null)
            return 0;

        return countNodes(root.left) + countNodes(root.right) + 1;

        /*
         * Queue<TreeNode> temp = new LinkedList<>();
         * int count = 1;
         * temp.add(root);
         * 
         * while(!temp.isEmpty()){
         * int s = temp.size();
         * 
         * for(int i = 0 ;i<s; i++){
         * TreeNode cur = temp.poll();
         * 
         * if(cur.left != null) {
         * temp.add(cur.left);
         * count++;
         * }
         * if(cur.right != null) {
         * temp.add(cur.right);
         * count++;
         * }
         * }
         * 
         * }
         */

    }
}