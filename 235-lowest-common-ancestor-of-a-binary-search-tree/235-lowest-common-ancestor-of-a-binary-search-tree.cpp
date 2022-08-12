/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* P, TreeNode* Q) {
                  if(root == NULL){
            return NULL;
        }	
    
        if(root->val < P->val && root->val < Q->val){
            return lowestCommonAncestor(root->right,P,Q);
        }
       else if(root->val > P->val && root->val > Q->val){
            return lowestCommonAncestor(root->left,P,Q);
       }
        
       return root;
    }
};
