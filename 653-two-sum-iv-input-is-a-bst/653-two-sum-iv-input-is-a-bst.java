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
    TreeNode root;
//DFS each node, and try to search the target 'node' such that 'node'.val = k-node.val
//make sure you don't pick the node itself, like if k = 2 and node.val = 1, don't return node itself!
public boolean findTarget(TreeNode node, int k) {
    if(this.root==null) this.root = node;//set variable for the root of this tree
    if(node==null) return false;
    if(search(node, k-node.val)) return true;//make sure you don't find the node itself!
    return findTarget(node.left,k)||findTarget(node.right,k);//DFS traverse
}
public boolean search(TreeNode node, int k){
    TreeNode current = root;//search from the root node
    while(current!=null){
        if(k>current.val) current = current.right;
        else if(k<current.val) current = current.left;
        else return current!=node?true:false;//you can't find the node itself!
    }
    return false;
}

}