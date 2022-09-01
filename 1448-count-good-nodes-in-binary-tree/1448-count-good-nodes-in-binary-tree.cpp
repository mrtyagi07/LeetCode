/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
 public:
 void helper(TreeNode* root, int prev, int &count)
{
    if(root==NULL) return;
    if(root->val>=prev)       // if current node value is greater than prev value  update prev value and increase count
    {
        count++;
        prev= root->val;
    }
    helper(root->left,prev,count);
    helper(root->right,prev,count);
    
}
int goodNodes(TreeNode* root) {
    int count=0;
    helper(root,INT_MIN,count);
    return count;
    
}
};
