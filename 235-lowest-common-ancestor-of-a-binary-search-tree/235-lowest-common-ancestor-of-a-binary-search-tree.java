/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode lcaNode;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lcaNode = root;
        lca(root , p , q);
        return lcaNode;
    }
    public void lca(TreeNode node , TreeNode p , TreeNode q){
        if(node.val>p.val && node.val>q.val)
            lca(node.left , p , q);
        else if(node.val<p.val && node.val<q.val)
            lca(node.right , p , q);
        else
            lcaNode = node;
        
    }
};