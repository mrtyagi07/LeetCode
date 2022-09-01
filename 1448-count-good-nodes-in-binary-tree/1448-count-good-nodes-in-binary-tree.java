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
    int count = 0;
    public int goodNodes(TreeNode root) {
        if(root != null) dfs(root, root.val);  
        return count;
    }
    public void dfs(TreeNode root, int max) {
        if(root.val >= max) count++;
        if(root.left != null) dfs(root.left, Math.max(max, root.left.val));
        if(root.right != null) dfs(root.right, Math.max(max, root.right.val));
    }
}