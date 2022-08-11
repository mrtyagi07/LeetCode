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
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    public boolean helper(TreeNode root, long max, long min){
        if(root == null) return true;
        if(root.val <= min || root.val >= max) return false;
        return helper(root.left, root.val, min) && helper(root.right, max, root.val);
    }
}
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//     TreeNode p=root,q=root;
//         if(root==null)
//             return true;
//         while(p.left!=null || p.right!=null){
//             if(p.val<=p.left.val || q.val>=q.right.val)
//                 return false;
//            else {
//                p=p.left;
//                q=q.right;
//            }
//         }
     
//           return true;
//     }
// }