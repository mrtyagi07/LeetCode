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
    
    public int goodNodes(TreeNode root) {
        return dfs(Integer.MIN_VALUE, root);
    }
    
    int dfs(int max, TreeNode root) {
        return root == null ? 0 : (root.val >= max ? 1 : 0) + dfs(Math.max(root.val, max), root.left) + dfs(Math.max(root.val, max), root.right);
    }
}