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
    public List<Integer> largestValues(TreeNode root) {

        ArrayList <Integer> res = new ArrayList<>();
        ArrayList <Integer> ans = new ArrayList<>();
        Queue <TreeNode> temp = new LinkedList<>();
        if(root == null) return ans;
        temp.add(root);
        
        while(!temp.isEmpty()){
            
            int s = temp.size();
            int a = Integer.MIN_VALUE;
            for(int i = 0; i<s; i++){

                TreeNode curr = temp.poll();

                if(curr.left != null) temp.add(curr.left);
                if(curr.right != null) temp.add(curr.right);
                a = Math.max(a, curr.val);
            }
        
            ans.add(a);
            
        }

        return ans;
    }
}