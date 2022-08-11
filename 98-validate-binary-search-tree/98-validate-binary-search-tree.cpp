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
    TreeNode *prev = NULL;
	bool isValidBST(TreeNode* root) {
		if(!root) return true;
		bool lt = isValidBST(root->left);
        if(prev && root->val <= prev->val) return false;
        prev = root;
        bool rt = isValidBST(root->right);
        return lt && rt;
	}
};